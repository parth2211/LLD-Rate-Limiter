package ratelimiter.ratelimitregistry.ratelimits;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LocationToApiLimit implements ApiLimit{

    Map<String, Map<String, Deque<Pair<Long, Long>>>> rateLimitLocDeque = new HashMap<>();

    Map<String, Pair<Long, Long>> maxHitCountPerTimeUnit = new HashMap<>();

    @Override
    public boolean contains(String endPoint) {
        return rateLimitLocDeque.containsKey(endPoint);
    }

    @Override
    public Pair<Object, Pair<Long, Long>> getRateLimitData(String endPoint, RateLimitParameters rateLimitParameters) {
        if(contains(endPoint)) {
            Pair<Long, Long> maxHitCountTimeUnitPair = maxHitCountPerTimeUnit.get(endPoint);
            Object rateLimitDS = rateLimitLocDeque.get(endPoint).get(rateLimitParameters.location.getCityName());
            return new Pair<>(rateLimitDS, maxHitCountTimeUnitPair);
        }
        return null;
    }
}

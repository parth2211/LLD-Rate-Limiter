package ratelimiter.ratelimitregistry.ratelimits;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CommonApiLimit implements ApiLimit{

    Map<String, Deque<Pair<Long, Long>>> rateLimiterDeque = new HashMap<>();

    Map<String, Pair<Long, Long>> maxHitCountPerTimeUnit = new HashMap<>();

    @Override
    public boolean contains(String endPoint) {
        return rateLimiterDeque.containsKey(endPoint);
    }

    @Override
    public Pair<Object, Pair<Long, Long>> getRateLimitData(String endPoint, RateLimitParameters rateLimitParameters) {
        if(contains(endPoint)) {
            Pair<Long, Long> maxHitCountTimeUnitPair = maxHitCountPerTimeUnit.get(endPoint);
            Object rateLimitDS = rateLimiterDeque.get(endPoint);
            return new Pair<>(rateLimitDS, maxHitCountTimeUnitPair);
        }
        return null;
    }
}

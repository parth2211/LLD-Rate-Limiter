package ratelimiter.ratelimitregistry.ratelimits;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LocationToApiLimit implements ApiLimit{

    Map<String, Map<String, Deque<Pair<Long, Long>>>> rateLimitLocDeque = new HashMap<>();

    Map<String, Pair<Long, Long>> maxHitCountPerTimeUnit;

    @Override
    public boolean contains(String endPoint) {
        return rateLimitLocDeque.containsKey(endPoint);
    }

    @Override
    public void hitEndPoint() {

    }
}

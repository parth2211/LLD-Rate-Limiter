package ratelimiter.ratelimitregistry.ratelimits;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CommonApiLimit implements ApiLimit{

    Map<String, Deque<Pair<Long, Long>>> rateLimiterDeque = new HashMap<>();

    Map<String, Pair<Long, Long>> maxHitCountPerTimeUnit;

    @Override
    public boolean contains(String endPoint) {
        return rateLimiterDeque.containsKey(endPoint);
    }

    @Override
    public void hitEndPoint() {

    }
}

package ratelimiter.ratelimitregistry.ratelimit;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CommonApiLimit implements ApiLimit{

    Map<String, Deque<Pair<Long, Long>>> rateLimiterDeque = new HashMap<>();

    @Override
    public boolean contains(String endPoint) {
        //rateLimiterDeque.containsKey(endPoint);
    }

    @Override
    public void hitEndPoint() {

    }
}

package ratelimiter.ratelimitregistry.ratelimit;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.Map;

public class LocationToApiLimit implements ApiLimit{

    Map<String, Map<String, Deque<Pair<Long, Long>>>> rateLimitLocDeque;

    @Override
    public boolean contains(String endPoint) {
        return false;
    }

    @Override
    public void hitEndPoint() {

    }
}

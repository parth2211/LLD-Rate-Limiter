package ratelimiter.ratelimitregistry.ratelimits;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class UserToApiLimit implements ApiLimit{

    Map<String, Map<Long, Deque<Pair<Long, Long>>>> rateLimitUserDeque = new HashMap<>();

    Map<String, Pair<Long, Long>> maxHitCountPerTimeUnit;

    @Override
    public boolean contains(String endPoint) {
        return rateLimitUserDeque.containsKey(endPoint);
    }

    @Override
    public void hitEndPoint() {

    }
}

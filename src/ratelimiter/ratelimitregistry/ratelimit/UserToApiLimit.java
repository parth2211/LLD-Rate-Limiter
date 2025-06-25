package ratelimiter.ratelimitregistry.ratelimit;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.Map;

public class UserToApiLimit implements ApiLimit{

    Map<String, Map<Long, Deque<Pair<Long, Long>>>> rateLimitUserDeque;

    @Override
    public boolean contains(String endPoint) {
        return false;
    }

    @Override
    public void hitEndPoint() {

    }
}

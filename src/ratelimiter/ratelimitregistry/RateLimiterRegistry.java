package ratelimiter.ratelimitregistry;

import ratelimiter.datastructure.Pair;

import java.util.Deque;
import java.util.Map;

public class RateLimiterRegistry {
    Map<String, Deque<Pair<Long, Long>>> rateLimiterDeque;
    Map<String, Map<Long, Deque<Pair<Long, Long>>>> rateLimitUserDeque;
}

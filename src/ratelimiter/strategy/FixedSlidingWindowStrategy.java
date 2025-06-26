package ratelimiter.strategy;

import ratelimiter.datastructure.Pair;

public class FixedSlidingWindowStrategy implements RateLimiterStrategyInterface{
    @Override
    public boolean isApiRequestAllowed(Pair<Object, Pair<Long, Long>> rateLimitDSandMaxHitPerTimeUnit, double noOfHits, double timeStamp) {
        // Your main rate Limiter logic;
        return false;
    }
}

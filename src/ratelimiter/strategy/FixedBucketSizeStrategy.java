package ratelimiter.strategy;

import ratelimiter.datastructure.Pair;

public class FixedBucketSizeStrategy implements RateLimiterStrategyInterface{
    @Override
    public boolean isApiRequestAllowed(Pair<Object, Pair<Long, Long>> rateLimitDSandMaxHitPerTimeUnit, double noOfHits, double timeStamp) {
        //Implement Fixed Bucket Size Strategy


        return false;
    }
}

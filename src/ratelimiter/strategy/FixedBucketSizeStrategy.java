package ratelimiter.strategy;

public class FixedBucketSizeStrategy implements RateLimiterStrategyInterface{
    @Override
    public boolean isApiRequestAllowed(double noOfHits, double timeStamp) {
        return false;
    }
}

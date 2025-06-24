package ratelimiter.strategy;

public class FixedSlidingWindowStrategy implements RateLimiterStrategyInterface{
    @Override
    public boolean isApiRequestAllowed(double noOfHits, double timeStamp) {
        return false;
    }
}

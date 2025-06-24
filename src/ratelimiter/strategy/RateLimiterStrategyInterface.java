package ratelimiter.strategy;

public interface RateLimiterStrategyInterface {
    public boolean isApiRequestAllowed(double noOfHits, double timeStamp);
}

package ratelimiter.strategy;

public interface RateLimiterStrategyInterface {
    public boolean isApiRequestAllowed(Object dataStructure, double noOfHits, double timeStamp);
}

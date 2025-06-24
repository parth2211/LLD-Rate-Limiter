package ratelimiter.service;

import ratelimiter.repository.RateLimiterRepository;
import ratelimiter.strategy.RateLimiterStrategyInterface;

public class RateLimiterService {
    RateLimiterStrategyInterface rateLimiterStrategy;
    RateLimiterRepository rateLimiterRepository;

    public RateLimiterService(RateLimiterStrategyInterface rateLimiterStrategy, RateLimiterRepository rateLimiterRepository) {
        this.rateLimiterStrategy = rateLimiterStrategy;
        this.rateLimiterRepository = rateLimiterRepository;
    }

    public boolean isApiRequestAllowed(long userId, String apiEndPoint, long noOfHits, long timeStamp) {
        return false;
    }

    public void setRateLimiterStrategy(RateLimiterStrategyInterface rateLimiterStrategy) {
        this.rateLimiterStrategy = rateLimiterStrategy;
    }
}

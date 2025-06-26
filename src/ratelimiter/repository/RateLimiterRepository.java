package ratelimiter.repository;

import ratelimiter.ratelimitregistry.registry.RateLimitRegistry;

public class RateLimiterRepository {
    private RateLimitRegistry rateLimitRegistry;

    public RateLimiterRepository(RateLimitRegistry rateLimitRegistry) {
        this.rateLimitRegistry = rateLimitRegistry;
    }


}

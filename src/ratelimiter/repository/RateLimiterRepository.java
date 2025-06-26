package ratelimiter.repository;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;
import ratelimiter.ratelimitregistry.registry.RateLimitRegistry;

import java.util.List;

public class RateLimiterRepository {
    private RateLimitRegistry rateLimitRegistry;

    public RateLimiterRepository(RateLimitRegistry rateLimitRegistry) {
        this.rateLimitRegistry = rateLimitRegistry;
    }

    public boolean checkRateLimitApplicability(String endPoint) {
        return rateLimitRegistry.checkRateLimitApplicability(endPoint);
    }

    public List<Pair<Object, Pair<Long, Long>>> getRateLimitDataList(String endPoint, RateLimitParameters extraCondition) {
        return rateLimitRegistry.getRateLimitDataList(endPoint, extraCondition);
    }
}

package ratelimiter.ratelimitregistry.registry;

import ratelimiter.ratelimitregistry.ratelimits.ApiLimit;

public interface RateLimitRegistry {

    public void addRateLimiter(ApiLimit apiLimit);

    public void removeRateLimiter(ApiLimit apiLimit);

    public boolean checkRateLimit(String endPoint, Object extraCondition, long hitCount, long timeStamp);

    public void hitRateLimit(String endPoint, Object extraCondition, long hitCount, long timeStamp);
}

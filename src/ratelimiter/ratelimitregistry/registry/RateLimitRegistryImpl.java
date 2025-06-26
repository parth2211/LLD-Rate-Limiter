package ratelimiter.ratelimitregistry.registry;

import ratelimiter.ratelimitregistry.ratelimits.ApiLimit;

import java.util.ArrayList;
import java.util.List;

public class RateLimitRegistryImpl implements RateLimitRegistry{

    List<ApiLimit> apiLimitList = new ArrayList<>();

    @Override
    public void addRateLimiter(ApiLimit apiLimit) {
        apiLimitList.add(apiLimit);
    }

    @Override
    public void removeRateLimiter(ApiLimit apiLimit) {
        apiLimitList.remove(apiLimit);
    }

    @Override
    public boolean checkRateLimit(String endPoint, Object extraCondition, long hitCount, long timeStamp) {
        for (ApiLimit apiLimit : apiLimitList) {
            if(apiLimit.contains(endPoint)) {

            }
        }
    }

    @Override
    public void hitRateLimit(String endPoint, Object extraCondition, long hitCount, long timeStamp) {

    }
}

package ratelimiter.ratelimitregistry.registry;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;
import ratelimiter.ratelimitregistry.ratelimits.ApiLimit;

import java.util.List;

public interface RateLimitRegistry {

    public void addRateLimiter(ApiLimit apiLimit);

    public void removeRateLimiter(ApiLimit apiLimit);

    public boolean checkRateLimitApplicability(String endPoint);

    public List<Pair<Object, Pair<Long, Long>>> getRateLimitDataList(String endPoint, RateLimitParameters extraCondition);
}

package ratelimiter.ratelimitregistry.ratelimits;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;

import java.util.List;

public interface ApiLimit {

    public boolean contains(String endPoint);

    public Pair<Object, Pair<Long, Long>> getRateLimitData(String endPoint, RateLimitParameters rateLimitParameters);
}

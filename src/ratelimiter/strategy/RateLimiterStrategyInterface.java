package ratelimiter.strategy;

import ratelimiter.datastructure.Pair;

public interface RateLimiterStrategyInterface {
    public boolean isApiRequestAllowed(Pair<Object, Pair<Long, Long>> dataStructure, double noOfHits, double timeStamp);
}

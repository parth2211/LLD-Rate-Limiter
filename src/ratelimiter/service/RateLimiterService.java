package ratelimiter.service;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;
import ratelimiter.repository.RateLimiterRepository;
import ratelimiter.strategy.RateLimiterStrategyInterface;

import java.util.List;

public class RateLimiterService {
    RateLimiterStrategyInterface rateLimiterStrategy;
    RateLimiterRepository rateLimiterRepository;

    public RateLimiterService(RateLimiterStrategyInterface rateLimiterStrategy, RateLimiterRepository rateLimiterRepository) {
        this.rateLimiterStrategy = rateLimiterStrategy;
        this.rateLimiterRepository = rateLimiterRepository;
    }

    public void setRateLimiterStrategy(RateLimiterStrategyInterface rateLimiterStrategy) {
        this.rateLimiterStrategy = rateLimiterStrategy;
    }

    public boolean isApiRequestAllowed(RateLimitParameters extraParameters, String apiEndPoint, long noOfHits, long timeStamp) {
        if(rateLimiterRepository.checkRateLimitApplicability(apiEndPoint)) {
            List<Pair<Object, Pair<Long, Long>>> rateLimitDataList = rateLimiterRepository.getRateLimitDataList(apiEndPoint, extraParameters);
            for(Pair<Object, Pair<Long, Long>> rateLimitData : rateLimitDataList) {
                if(!rateLimiterStrategy.isApiRequestAllowed(rateLimitData, noOfHits, timeStamp)) {
                    return false;
                }
            }
        }
        return true;
    }
}

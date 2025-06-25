package ratelimiter.strategy;

public class FixedBucketSizeStrategy implements RateLimiterStrategyInterface{
    @Override
    public boolean isApiRequestAllowed(Object dataStructure, double noOfHits, double timeStamp) {
        //Implement Fixed Bucket Size Strategy


        return false;
    }
}

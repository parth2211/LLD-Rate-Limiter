package ratelimiter.ratelimitregistry.registry;

import ratelimiter.datastructure.Pair;
import ratelimiter.entity.RateLimitParameters;
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
    public boolean checkRateLimitApplicability(String endPoint) {
        for (ApiLimit apiLimit : apiLimitList) {
            if(apiLimit.contains(endPoint)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Pair<Object, Pair<Long, Long>>> getRateLimitDataList(String endPoint, RateLimitParameters extraCondition) {
        List<Pair<Object, Pair<Long, Long>>> list = new ArrayList<>();

        for(ApiLimit apiLimit: apiLimitList) {
            if(apiLimit.contains(endPoint)) {
                list.add(apiLimit.getRateLimitData(endPoint, extraCondition));
            }
        }
        return list;
    }
}

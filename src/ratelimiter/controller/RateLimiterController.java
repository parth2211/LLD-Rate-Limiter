package ratelimiter.controller;

import ratelimiter.dto.RateLimitResponseDto;
import ratelimiter.dto.RateLimiterRequestDto;
import ratelimiter.entity.Location;
import ratelimiter.entity.RateLimitParameters;
import ratelimiter.entity.User;
import ratelimiter.service.RateLimiterService;

public class RateLimiterController {
    RateLimiterService rateLimiterService;

    public RateLimiterController(RateLimiterService rateLimiterService) {
        this.rateLimiterService = rateLimiterService;
    }

    RateLimitResponseDto isApiRequestAllowed(RateLimiterRequestDto rateLimiterRequestDto) {
        String location = rateLimiterRequestDto.getLocation();
        long userId = rateLimiterRequestDto.getUserId();
        String apiEndPoint = rateLimiterRequestDto.getEndPoint();
        long noOfHits = rateLimiterRequestDto.getNoOfHits();
        long timeStamp = rateLimiterRequestDto.getTimeStamp();

        RateLimitParameters rateLimitParameters = new RateLimitParameters();
        rateLimitParameters.setUser(new User(userId));
        rateLimitParameters.setLocation(new Location(location));

        boolean isAllowed = rateLimiterService.isApiRequestAllowed(rateLimitParameters, apiEndPoint, noOfHits, timeStamp);

        RateLimitResponseDto rateLimitResponseDto = new RateLimitResponseDto();
        rateLimitResponseDto.setAllowed(isAllowed);

        return rateLimitResponseDto;
    }
}

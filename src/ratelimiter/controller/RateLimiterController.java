package ratelimiter.controller;

import ratelimiter.dto.RateLimitResponseDto;
import ratelimiter.dto.RateLimiterRequestDto;
import ratelimiter.service.RateLimiterService;

public class RateLimiterController {
    RateLimiterService rateLimiterService;

    public RateLimiterController(RateLimiterService rateLimiterService) {
        this.rateLimiterService = rateLimiterService;
    }

    RateLimitResponseDto isApiRequestAllowed(RateLimiterRequestDto rateLimiterRequestDto) {
        long userId = rateLimiterRequestDto.getUserId();
        String apiEndPoint = rateLimiterRequestDto.getEndPoint();
        long noOfHits = rateLimiterRequestDto.getNoOfHits();
        long timeStamp = rateLimiterRequestDto.getTimeStamp();

        boolean isAllowed = rateLimiterService.isApiRequestAllowed(userId, apiEndPoint, noOfHits, timeStamp);

        RateLimitResponseDto rateLimitResponseDto = new RateLimitResponseDto();
        rateLimitResponseDto.setAllowed(isAllowed);

        return rateLimitResponseDto;
    }
}

package ratelimiter.dto;

public class RateLimitResponseDto {
    private boolean isAllowed;

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean allowed) {
        isAllowed = allowed;
    }
}

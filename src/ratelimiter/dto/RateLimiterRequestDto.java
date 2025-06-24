package ratelimiter.dto;

public class RateLimiterRequestDto {

    private long userId;
    private String endPoint;
    private long noOfHits;
    private long timeStamp;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public long getNoOfHits() {
        return noOfHits;
    }

    public void setNoOfHits(long noOfHits) {
        this.noOfHits = noOfHits;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}

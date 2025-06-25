package ratelimiter.ratelimitregistry.ratelimit;

public interface ApiLimit {
    public boolean contains(String endPoint);
    public void hitEndPoint();
}

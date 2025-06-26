package ratelimiter.ratelimitregistry.ratelimits;

public interface ApiLimit {

    public boolean contains(String endPoint);

    public boolean checkRateLimit();

    public void hitEndPoint();
}

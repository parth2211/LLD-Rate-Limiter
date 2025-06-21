# LLD-Rate-Limiter
Rate Limiter (asked in Directi)

We need a rate limiting system to prevent resource abuse and apply fair usage policies

Core Requirements:

Multiple Time-Window Limits: Support short-term (seconds, minutes, hours) and long-term rate limits.

Complex Rules:

Example: All users from a single IP must not exceed 1 MB/sec download.

Example: For API /heavyApi, any user must not exceed 100 calls/minute.

Example: For API /costlyApi, an IP cannot exceed 1 TB/sec.

The system must be easily configurable and extendable in the future.

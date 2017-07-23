# Cloud Skeleton

Skeleton for possible Microservice Oriented Architecture.

1. Run discovery-service
2. Run gateway-service
3. Run msg-app
4. Run msg-service, first instance
5. Run msg-service, second instance (on different port)
6. Run hystrix-dashboard
7. Run turbine-service

8. Go to http://localhost:8761 (verify all instances are registered with eureka)
9. In browser, go to http://localhost:8080/hystrix
10. In input field; enter "http://localhost:3000/turbine.stream" (observe msg-app metrics)
11. Hit multiple times $ http://localhost:8080/msg/time (verify port is changing in response)
12. Kill second instance of msg-service
13. Hit multiple times $ http://localhost:8080/msg/time (verify only port 1111 is responding, circuit breaker is open for port 2222)


Current Limitations
-------------------

No implementation for fallback logic

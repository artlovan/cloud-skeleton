package io.lovan.artem.msgapp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DateTimeService {

    @Autowired
//    @LoadBalanced
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "unknown")
    public String getDateTime() {
        return restTemplate.getForEntity("http://msg-service/time", String.class)
                .getBody();
    }

    public String unknown() {
        return "unknown time, please try again later";
    }
}

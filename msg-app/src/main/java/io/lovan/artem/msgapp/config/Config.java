package io.lovan.artem.msgapp.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Configuration
public class Config {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


//    @Bean
//    public ZuulFallbackProvider zuulFallbackProvider() {
//
//        return new ZuulFallbackProvider() {
//            @Override
//            public String getRoute() {
//                return "zuulserver";
//            }
//
//            @Override
//            public ClientHttpResponse fallbackResponse() {
//                return new ClientHttpResponse() {
//                    @Override
//                    public HttpStatus getStatusCode() throws IOException {
//                        return HttpStatus.OK;
//                    }
//
//                    @Override
//                    public int getRawStatusCode() throws IOException {
//                        return 200;
//                    }
//
//                    @Override
//                    public String getStatusText() throws IOException {
//                        return "OK";
//                    }
//
//                    @Override
//                    public void close() {
//
//                    }
//
//                    @Override
//                    public InputStream getBody() throws IOException {
//                        return new ByteArrayInputStream("fallback".getBytes());
//                    }
//
//                    @Override
//                    public HttpHeaders getHeaders() {
//                        HttpHeaders headers = new HttpHeaders();
//                        headers.setContentType(MediaType.APPLICATION_JSON);
//                        return headers;
//                    }
//                };
//            }
//        };
//    }
}

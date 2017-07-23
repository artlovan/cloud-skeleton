package io.lovan.artem.msgservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MsgServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgServiceApplication.class, args);
	}

    @Value("${server.port}")
    private int port;

    @GetMapping("/time")
    public String getTime() throws InterruptedException {
//        Thread.sleep(10000);
	    return new Date().toString() + " on PORT: " + port;
    }


    @GetMapping("/uuid")
    public String getDate() {
        return UUID.randomUUID().toString() + " on PORT: " + port;
    }
}

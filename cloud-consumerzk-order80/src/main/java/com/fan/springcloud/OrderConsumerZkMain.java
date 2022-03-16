package com.fan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shkstart
 * @create2022-03-1612:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerZkMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerZkMain.class, args);
    }
}

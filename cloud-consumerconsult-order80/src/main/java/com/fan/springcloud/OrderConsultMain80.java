package com.fan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shkstart
 * @create2022-03-1613:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsultMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsultMain80.class, args);
    }
}

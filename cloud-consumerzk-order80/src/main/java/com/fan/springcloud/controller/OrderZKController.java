package com.fan.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create2022-03-1612:47
 */
@Slf4j
@RestController
public class OrderZKController {
     public static final String INVOKE_URL = "http://consul-provider-payment";
     @Autowired
     private RestTemplate restTemplate;

     @RequestMapping(value = "/consumer/payment/consul")
     public String paymentInfo()
     {
          String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul", String.class);
          System.out.println("消费者调用支付服务(zookeeper)--->result:" + result);
          return result;
     }

}

package com.fan.springcloud.controller;

import com.fan.springcloud.entities.CommonResult;
import com.fan.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create2022-03-1516:01
 */
@RestController
@Slf4j
public class OrderController {
//    public static final String PAYMENT_URL="http://localhost:8001";单机版，写死的
  public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";//一个微服务名称对应多个端口号，多个服务器。

    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/add")
    public CommonResult<Payment> add(Payment payment){
        //消费者模块调用生产者模块，相当于请求转发一样，但是这个参数是以json格式传过去的，所以转发过去的那边要用@requestbody接受请求参数。
        return restTemplate.postForObject(PAYMENT_URL+"/payment/add", payment, CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        //消费者模块调用生产者模块，相当于请求转发一样
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}

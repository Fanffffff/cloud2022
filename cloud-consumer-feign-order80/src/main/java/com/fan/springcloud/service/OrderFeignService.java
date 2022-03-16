package com.fan.springcloud.service;

import com.fan.springcloud.entities.entities.CommonResult;
import com.fan.springcloud.entities.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shkstart
 * @create2022-03-1616:53
 *
 *
 * 这里相当于是请求转发到CLOUD-PAYMENT-SERVICE这个服务下的payment8002 , payment8001中的/payment/get/{id}方法
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface OrderFeignService {
    @GetMapping("/payment/get/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();

}

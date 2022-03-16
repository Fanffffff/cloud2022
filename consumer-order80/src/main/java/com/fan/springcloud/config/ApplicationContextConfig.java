package com.fan.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create2022-03-1516:08
 */
@Configuration
public class ApplicationContextConfig {
    //下面把这个组件注册进去，可以请求转发到其他模块的controller，见本包中的controller类。
    @Bean
    @LoadBalanced//开启负载均衡,这样才可以通过微服务名称来访问
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

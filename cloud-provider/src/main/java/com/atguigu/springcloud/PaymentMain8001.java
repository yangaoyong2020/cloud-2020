package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @date: 2020/4/2
 * @author wangth
 * @title: PaymentMain8001
 * @version: 1.0
 * @description:
 * update_version: update_date: update_author: update_note:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {
    
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}

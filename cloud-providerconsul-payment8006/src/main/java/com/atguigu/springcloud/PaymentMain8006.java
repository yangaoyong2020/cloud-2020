package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @date: 2020/4/9
 * @author wangth
 * @title: PaymentMain8006
 * @version: 1.0
 * @description:
 * update_version: update_date: update_author: update_note:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}

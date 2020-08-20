package com.atguigu.springcloud;

import com.atguigu.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标，每次服务器重启后rest接口计数从1开始
 *  List[0] instances = localhost:8002
 *  List[1] instances = localhost:8001
 *  8001 + 8002 组成集群，共计两台机器，集群总数为2，按照轮询算法：
 *
 *  当总请求数为1时： 1 % 2 =1 对应下标位置为1，则获得地址为list[1] 即：localhost：8001
 *
 * @date: 2020/4/11
 * @author wangth
 * @title: Ordermain80
 * @version: 1.0
 * @description:
 * update_version: update_date: update_author: update_note:
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
public class Ordermain80 {
    public static void main(String[] args) {
        SpringApplication.run(Ordermain80.class, args);
    }
}

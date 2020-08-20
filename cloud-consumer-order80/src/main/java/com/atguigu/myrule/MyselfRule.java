package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//注意使用其他规则的时候，要注意不能和启动类放在同一个包下面，主要原因是启动类中，包含compentscan这个包扫描到的文件
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){

        //定义为随机规则
        return  new RandomRule();
    }
}

package com.fyyzi.springcloud.consumer.dept;

import com.fyyzi.springcloud.consumer.myrule.MySqlfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-PROVIDERE-DEPT",configuration = MySqlfRule.class)
@EnableFeignClients(basePackages = {"com.fyyzi.springcldou.service"})
public class ConsumerDeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptApplication.class, args);
    }
}

package com.fyyzi.springcloud.consumer.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerDeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptApplication.class, args);
    }
}

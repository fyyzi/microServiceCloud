package com.fyyzi.springcloud.consumer.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySqlfRule {

    @Bean
    public IRule getIRule(){
//        return new RandomRule();
        return new RandomRule_Xy();
    }

}

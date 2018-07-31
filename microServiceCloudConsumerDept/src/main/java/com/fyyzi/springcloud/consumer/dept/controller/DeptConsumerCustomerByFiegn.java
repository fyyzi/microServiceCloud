package com.fyyzi.springcloud.consumer.dept.controller;

import com.fyyzi.springcldou.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerCustomerByFiegn {

    //    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDERE-DEPT";

    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping(value = "/consumer/dept/discovery")
//    @LoadBalanced
//    public boolean add(Dept dept) {
//        Boolean forObject = restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", Boolean.class);
////        Boolean resultBoolean = restTemplate.postForObject(REST_URL_PREFIX + "/dept/list", dept, Boolean.class);
//        return forObject;
//    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }


}

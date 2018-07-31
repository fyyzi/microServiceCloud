package com.fyyzi.springcloud.consumer.dept.controller;

import com.fyyzi.springcldou.entities.Dept;
import com.fyyzi.springcldou.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fiegn")
public class DeptConsumerByFiegnCustomer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();

//        return null;
    }


}

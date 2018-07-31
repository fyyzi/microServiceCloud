package com.fyyzi.springcldou.service;

import com.fyyzi.springcldou.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-PROVIDERE-DEPT")
public interface DeptClientService {

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();

    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept);

}

package com.fyyzi.springcloud.provider.dept.service;

import com.fyyzi.springcldou.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}

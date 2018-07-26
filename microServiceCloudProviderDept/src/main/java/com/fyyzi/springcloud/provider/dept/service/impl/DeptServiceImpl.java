package com.fyyzi.springcloud.provider.dept.service.impl;

import com.fyyzi.springcldou.Dept;
import com.fyyzi.springcloud.provider.dept.dao.DeptDao;
import com.fyyzi.springcloud.provider.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    //    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
//        return dao.addDept(dept);
        return true;
    }

    @Override
    public Dept get(Long id) {
//        return dao.findById(id);
        Dept dept = new Dept();
        dept.setDb_source("dbSource");
        return dept;
    }

    @Override
    public List<Dept> list() {
//        return dao.findAll();
        List<Dept> depts = new ArrayList<>();

        return depts;
    }
}

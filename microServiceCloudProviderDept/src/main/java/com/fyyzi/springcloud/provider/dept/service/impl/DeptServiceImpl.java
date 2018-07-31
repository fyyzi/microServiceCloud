package com.fyyzi.springcloud.provider.dept.service.impl;

import com.fyyzi.springcldou.entities.Dept;
import com.fyyzi.springcloud.provider.dept.dao.DeptDao;
import com.fyyzi.springcloud.provider.dept.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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

        int localPort = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getLocalPort();

        Dept dept = new Dept();
        dept.setId(localPort);

        depts.add(dept);
        return depts;
    }
}

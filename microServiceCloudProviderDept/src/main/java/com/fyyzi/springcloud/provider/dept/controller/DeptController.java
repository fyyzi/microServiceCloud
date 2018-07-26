package com.fyyzi.springcloud.provider.dept.controller;

import com.fyyzi.springcldou.Dept;
import com.fyyzi.springcloud.provider.dept.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class DeptController {

    private static final Logger logger = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        logger.info("return");
        return deptService.list();
    }

    @GetMapping(value = "dept/discovery")
    public Object discovery() {
        List<String> list = discoveryClient.getServices();
        logger.info("*************" + list);

        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-PROVIDERE-DEPT");
        for (int i = 0; i < instances.size(); i++) {
            ServiceInstance serviceInstance = instances.get(i);
            logger.info(serviceInstance.getServiceId() + "\t"
                    + serviceInstance.getHost() + "\t"
                    + serviceInstance.getPort() + "\t"
                    + serviceInstance.getUri());
        }
        return this.discoveryClient;
    }
}

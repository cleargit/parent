package com.shamer.provide.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.shamer.api.service.DemoService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImp implements DemoService {
    @Override
    public String demo(String name) {
        return name;
    }
}

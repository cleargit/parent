package com.shamer.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shamer.api.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    DemoService demoService;

    @RequestMapping("/demo")
    public String demo(){
        return demoService.demo("shamer");
    }
}

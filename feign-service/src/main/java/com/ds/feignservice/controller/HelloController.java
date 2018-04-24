package com.ds.feignservice.controller;

import com.ds.feignservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.ds.feignservice.controller
 *
 * @author tongdongsheng
 * @date 2018/04/24
 */
@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @RequestMapping("/hello")
    public String hello(String name) {
        return service.sayHello(name);
    }
}

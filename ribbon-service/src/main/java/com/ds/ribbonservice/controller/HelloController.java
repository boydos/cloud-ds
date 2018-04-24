package com.ds.ribbonservice.controller;

import com.ds.ribbonservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.ds.ribbonservice.controller
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
        return service.hello(name);
    }
}

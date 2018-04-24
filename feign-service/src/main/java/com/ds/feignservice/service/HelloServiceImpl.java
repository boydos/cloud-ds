package com.ds.feignservice.service;

import org.springframework.stereotype.Component;

/**
 * com.ds.feignservice.filter
 *
 * @author tongdongsheng
 * @date 2018/04/24
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return String.format("hi %s, i am feign, you are wrong!", name);
    }
}

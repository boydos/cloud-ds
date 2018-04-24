package com.ds.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * com.ds.ribbonservice.filter
 *
 * @author tongdongsheng
 * @date 2018/04/24
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return template.getForObject("http://EUREKA-CLIENT/?name=" + name, String.class);
    }

    public String helloError(String name) {
        return String.format("Hi %s, i am hystrix, you are wrong!", name);
    }
}

package com.ds.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.ds.feignservice.filter
 *
 * @author tongdongsheng
 * @date 2018/04/24
 */
@FeignClient(value = "EUREKA-CLIENT", fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}

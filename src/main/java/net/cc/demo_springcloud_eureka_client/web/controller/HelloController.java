package net.cc.demo_springcloud_eureka_client.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-05-13 11:31
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "hello";
    }
}
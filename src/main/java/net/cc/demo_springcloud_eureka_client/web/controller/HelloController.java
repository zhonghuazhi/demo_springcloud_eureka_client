package net.cc.demo_springcloud_eureka_client.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-05-13 11:31
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {

        String str = String.format("Date [%s]  Msg [%s]", getSysDate(), "Hello");
        System.out.println(str);

        return str;
    }


    /**
     * 功能描述:
     * 获取系统当前时间
     *
     * @param
     * @return: java.lang.String
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-05-13 22:01
     */
    protected String getSysDate() {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
package com.louis.mango.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
//回调类
@Component
public class MangoProducerHystrix implements MangoProducerService {

    @RequestMapping("/hello")
    public String hello() {
    	//返回调用失败后的信息
    	return "sorry, hello service call failed.";
    }
}

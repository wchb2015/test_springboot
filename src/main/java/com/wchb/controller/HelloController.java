package com.wchb.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${mobileNumber}")
    private String mobileNumber;

    @RequestMapping(value = {"hi", "hello"}, method = RequestMethod.GET)
    public String say() throws Exception {
        if (true) {
            throw new Exception("haha异常啊!");
        }
        return "hello spring boot!!!" + mobileNumber;
//        return "index";
    }
}

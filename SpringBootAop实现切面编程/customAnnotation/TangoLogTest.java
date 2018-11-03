package com.tango.customAnnotation;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TangoLogTest {

    public String hehe="hehe";

    @RequestMapping("6")
    @TangoLog("aaa")
    public String hello(String hehe){
        System.out.println(hehe);
        return "hello";
    }
}

package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Appcontroller {

    @Autowired
    public ApplicationEventPublisher publisher;

    @GetMapping("/getInfo")
    public String getmap(){
        App tango2 = new App.Builder().name("hello").sex("不是！").age(4).build();
        publisher.publishEvent(new TangoEvent(tango2));
        publisher.publishEvent(new EventLearnEvent(this,tango2));
        return "success";
    }
}

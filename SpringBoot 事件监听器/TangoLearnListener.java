package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TangoLearnListener  {

    @EventListener
    public void register(EventLearnEvent event){
        App app = event.getApp();
        System.out.println("secondEvent"+app);

    }
}

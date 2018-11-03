package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class TangoEvent extends ApplicationEvent {
    public TangoEvent(Object source) {
        super(source);
    }

/*    private App app;
    public TangoEvent(Object source,App app){
        super(source);
        this.app=app;
    }*/

    public App getApp(){
        return (App)this.source;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

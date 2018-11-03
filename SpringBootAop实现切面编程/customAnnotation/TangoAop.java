package com.tango.customAnnotation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = {("com.tango.customAnnotation")})
@EnableAspectJAutoProxy
public class TangoAop {

    public static void main(String[] args) {
        SpringApplication.run(TangoAop.class);
    }
}

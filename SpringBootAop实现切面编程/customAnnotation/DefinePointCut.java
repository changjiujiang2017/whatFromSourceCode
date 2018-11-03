package com.tango.customAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Component
@Aspect
public class DefinePointCut {

    @Pointcut("@annotation(com.tango.customAnnotation.TangoLog)")
    public void pointCut(){

    }


    @Before("pointCut()")
    public void before(JoinPoint point) throws Exception {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        Field hehe = method.getDeclaringClass().getDeclaredField("hehe");
        hehe.setAccessible(true);
        TangoLog log = method.getAnnotation(TangoLog.class);
        System.out.println(signature.getMethod().getName());
    }

    @After("pointCut()")
    public void afterPoint(){
        System.out.println("世界如此美好！");
    }

}

package com.project.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

//    @Around("execution (* com.project.aop.serviceimpl.Aopimpl.testAop(..))")
//    Object executeAopCheck(ProceedingJoinPoint jp) throws Throwable {
//        System.out.println("Before !!!!!!");
//        Object retValue=jp.proceed();
//        System.out.println("After !!!!!");
//        return retValue;
//    }}


    @AfterReturning(value = "execution (* com.project.aop.serviceimpl.Aopimpl.testAop(..))",
    returning = "retVal")
    void executeAopCheck(Object retVal) throws Throwable {
        String returnedValue= (String) retVal;
        System.out.println("Returned Value is: "+returnedValue);
    }}  

package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class ExceptionHandLingAspect {
    @Before("com.zaurtregulov.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void boforeAddExceptionHandLingAdvice(){
        System.out.println("boforeAddExceptionHandLingAdvice: ловим/обрабатываем" +
                "исключения при попытке получить книгу/журнал");
        System.out.println("_____________________________");
    }
}

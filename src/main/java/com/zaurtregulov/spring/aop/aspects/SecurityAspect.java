package com.zaurtregulov.spring.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {

    @Before("com.zaurtregulov.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: проверка прав на получение книги/журнала");
        System.out.println("_____________________________");
    }
}

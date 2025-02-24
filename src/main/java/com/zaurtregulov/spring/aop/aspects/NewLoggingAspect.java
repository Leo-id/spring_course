package com.zaurtregulov.spring.aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "в библиотеку пытаются вернуть книгу книгу");
        Object targetMethodResult=null;
//        long begin=System.currentTimeMillis();
        try {
            targetMethodResult=proceedingJoinPoint.proceed();

        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение: "+
                    e);
           throw e;
        }

//        long end=System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: " +
                "в библиотеку возвращают книгу");
//        System.out.println("Время: "+(end-begin));
        return targetMethodResult;
    }
}

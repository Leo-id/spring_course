package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void boforeGetStudentsLoggingAdvice(){
//        System.out.println("boforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents");
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())"
//    , returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstSt=students.get(0);
//        String nameSurname= firstSt.getNameSurname();
//        nameSurname="Mr. "+nameSurname;
//        firstSt.setNameSurname(nameSurname);
//
//        double avgG=firstSt.getAvgGrade();
//        avgG=5.7;
//        firstSt.setAvgGrade(avgG);
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы методом getStudents");
//    }



//    @AfterThrowing(pointcut = "execution(* getStudents())"
//    ,throwing = "exception")
//    public void afterRThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterRThrowingGetStudentsLoggingAdvice: логируем выброс исключения "+exception);
//    }


    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем все");
    }


}

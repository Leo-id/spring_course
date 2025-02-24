package com.zaurtregulov.spring.aop;

import com.zaurtregulov.spring.aop.aspects.Student;
import com.zaurtregulov.spring.aop.aspects.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method mail starts");
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);


        UniLibrary library=context.getBean("uniLibrary", UniLibrary.class);
        String bookNeame=library.returnBook();
        System.out.println("В библиотеку вернули клину "+bookNeame);


        context.close();
        System.out.println("Method mail ends");
    }
}

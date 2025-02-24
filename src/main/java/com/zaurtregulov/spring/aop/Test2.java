package com.zaurtregulov.spring.aop;

import com.zaurtregulov.spring.aop.aspects.Student;
import com.zaurtregulov.spring.aop.aspects.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university=context.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> students=university.getStudents();
            System.out.println(students);
        }catch (Exception e){
            System.out.println("Было поймано иселючение: "+e);
        }


        context.close();
    }
}

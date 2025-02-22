package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1=context.getBean("catBean", Pet.class);
//        Pet ca2=context.getBean("catBean", Pet.class);


        Person person=context.getBean("personBean", Person.class);
        System.out.println(person.getSurmane());
        System.out.println(person.getAge());
//        Person person2=context.getBean("personBean", Person.class);
//        person.callYourPet();




        context.close();
    }
}

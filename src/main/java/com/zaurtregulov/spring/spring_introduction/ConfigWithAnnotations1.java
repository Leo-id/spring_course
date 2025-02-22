package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();


        System.out.println(person.getAge());
        System.out.println(person.getSurmane());


        Cat myCat=context.getBean("catBean", Cat.class);
        myCat.say();
        context.close();
    }
}

package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//@Autowired
//@Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surmane;
    @Value("22")
    private int age;

//@Autowired  // если одни конструктор то не обязательно писать анатацию
//    public Person(@Qualifier("dog")Pet pet) {
//        System.out.println("Person bean is createt");
//        this.pet = pet;
//    }


    public Person(Pet pet) {
        System.out.println("Person bean is createt");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is createt");
    }
//@Autowired
//@Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        System.out.println("Class person: set surname");
        this.surmane = surmane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}

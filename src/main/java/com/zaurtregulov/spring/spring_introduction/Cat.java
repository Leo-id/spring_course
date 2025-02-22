package com.zaurtregulov.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean") //название любое
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is ccreatet");
    }

    @Override
    public void say() {
        System.out.println("May-may");
    }

}

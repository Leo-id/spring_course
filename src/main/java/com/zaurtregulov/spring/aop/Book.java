package com.zaurtregulov.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    public String name;

    @Value("Ф.М. Достоевский")
    public String autor;

    @Value("1866")
    public String yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}

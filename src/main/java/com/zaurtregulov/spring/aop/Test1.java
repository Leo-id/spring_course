package com.zaurtregulov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary=context.getBean("uniLibrary", UniLibrary.class);
        Book book=context.getBean("book", Book.class);

        uniLibrary.getBook();
//        uniLibrary.getMagazine();
        uniLibrary.addBook("Zaur", book);
        uniLibrary.addMagazine();

//        uniLibrary.returnBook();


//        SchoolLibrary schoolLibrary=context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}

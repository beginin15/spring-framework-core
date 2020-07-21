package com.course.spring_framework.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringFrameworkCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.getBookRepository() != null);
    }

}

package com.course.spring_framework.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringFrameworkCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.getBookRepository() != null);
    }

}

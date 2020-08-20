package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    int value;

    @Value("#{'hello ' + 'world'}")
    String greeting;

    @Value("hello")
    String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("---------------------");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(hello);
    }
}

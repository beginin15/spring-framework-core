package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("proto by single");

        System.out.println(context.getBean(Single.class).getProto());
        System.out.println(context.getBean(Single.class).getProto());
        System.out.println(context.getBean(Single.class).getProto());
    }
}

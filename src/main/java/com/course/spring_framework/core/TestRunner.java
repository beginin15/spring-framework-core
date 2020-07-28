package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Value("${app.user}")
    String user;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("app.name"));
        System.out.println(user);
    }
}

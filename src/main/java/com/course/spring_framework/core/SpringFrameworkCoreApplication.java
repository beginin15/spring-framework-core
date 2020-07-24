package com.course.spring_framework.core;

import com.course.spring_framework.out.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class SpringFrameworkCoreApplication {

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringFrameworkCoreApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) context -> {
            context.registerBean(TestService.class);
            context.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Application Runner!"));
        });
        app.run(args);
    }

}

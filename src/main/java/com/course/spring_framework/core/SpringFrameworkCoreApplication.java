package com.course.spring_framework.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringFrameworkCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkCoreApplication.class, args);
    }

}

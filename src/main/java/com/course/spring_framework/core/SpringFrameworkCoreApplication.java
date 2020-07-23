package com.course.spring_framework.core;

import com.course.spring_framework.out.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkCoreApplication {

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkCoreApplication.class, args);
    }

}

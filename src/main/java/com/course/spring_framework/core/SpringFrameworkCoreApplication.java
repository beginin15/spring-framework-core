package com.course.spring_framework.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkCoreApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringFrameworkCoreApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}

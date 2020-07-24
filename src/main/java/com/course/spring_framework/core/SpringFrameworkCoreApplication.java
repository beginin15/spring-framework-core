package com.course.spring_framework.core;

import com.course.spring_framework.out.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class SpringFrameworkCoreApplication {

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringFrameworkCoreApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) context -> {
            context.registerBean(TestService.class);
            context.registerBean(ApplicationRunner.class, new Supplier<ApplicationRunner>() {
                @Override
                public ApplicationRunner get() {
                    return new ApplicationRunner() {
                        @Override
                        public void run(ApplicationArguments args) throws Exception {
                            System.out.println("Application Runner!");
                        }
                    };
                }
            });
        });
        app.run(args);
    }

}

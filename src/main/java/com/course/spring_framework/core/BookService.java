package com.course.spring_framework.core;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements InitializingBean {

    @Autowired
    private BookRepository myBookRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myBookRepository);
    }
}

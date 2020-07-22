package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {

    @Autowired
    private BookRepository myBookRepository;

    @PostConstruct
    public void setUp() {
        System.out.println(myBookRepository);
    }
}

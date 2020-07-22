package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository myBookRepository;

    public void pringBookRepository() {
        System.out.println(myBookRepository);
    }
}

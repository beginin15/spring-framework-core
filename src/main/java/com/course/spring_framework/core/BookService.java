package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired @Qualifier(value = "yourBookRepository")
    private BookRepository bookRepository;

    public void pringBookRepository() {
        System.out.println(bookRepository);
    }
}

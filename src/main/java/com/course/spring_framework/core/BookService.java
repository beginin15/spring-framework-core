package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired(required = false)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}

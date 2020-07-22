package com.course.spring_framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private List<BookRepository> bookRepositories;

    public void pringBookRepository() {
        bookRepositories.forEach(System.out::println);
    }
}

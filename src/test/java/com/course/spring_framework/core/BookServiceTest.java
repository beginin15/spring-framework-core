package com.course.spring_framework.core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookServiceTest {

    @Test
    void save() {
        // given
        Book book = new Book();

        // when
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        Book result = bookService.save(book);

        // then
        assertThat(book.getCreated()).isNotNull();
        assertThat(book.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();
    }
}

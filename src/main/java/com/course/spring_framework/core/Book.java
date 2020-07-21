package com.course.spring_framework.core;

import java.util.Date;

public class Book {

    private Date created;

    private BookStatus bookStatus;

    public void setCreated(Date date) {
        this.created = date;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Date getCreated() {
        return created;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }
}

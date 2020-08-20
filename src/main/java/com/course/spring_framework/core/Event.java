package com.course.spring_framework.core;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Event {

    @NotNull
    @Min(0)
    private Integer id;

    @NotEmpty
    private String title;

    @NotNull
    @Email
    private String email;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.course.spring_framework.core;

public class MyEvent {

    private Object source;
    private int data;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

package com.course.spring_framework.core;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis(); // 성능 측정 기능 (흩어진 관심사)

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Create an event");

        System.out.println(System.currentTimeMillis() - begin); // 성능 측정 기능 (흩어진 관심사)
    }

    @Override
    public void publicEvent() {
        long begin = System.currentTimeMillis(); // 성능 측정 기능 (흩어진 관심사)
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Public an event");

        System.out.println(System.currentTimeMillis() - begin); // 성능 측정 기능 (흩어진 관심사)
    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an event");
    }
}

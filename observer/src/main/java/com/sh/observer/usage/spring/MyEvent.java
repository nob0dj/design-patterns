package com.sh.observer.usage.spring;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

    private String message;

    /**
     *
     * @param source 이벤트 발생객체체     * @param message
     */
    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

//public class MyEvent {
//
//    private String message;
//
//    public MyEvent(String message) {
//        this.message = message;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//}
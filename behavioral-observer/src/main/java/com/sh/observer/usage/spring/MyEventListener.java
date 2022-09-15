package com.sh.observer.usage.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.getSource()); // com.sh.observer.usage.spring.MyRunner@29d37757
        System.out.println(event.getMessage()); // hello spring event
    }
}

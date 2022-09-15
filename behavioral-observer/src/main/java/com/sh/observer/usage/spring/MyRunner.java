package com.sh.observer.usage.spring;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

    /**
     * ApplicationEventPublisher
     * ApplicationContext가 구현하고 있는 interface
     * - publisher의 타입을 ApplicationContext로 지정하는 것도 가능.
     */
//    private ApplicationContext publisher;
    private ApplicationEventPublisher publisher;

    public MyRunner(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyRunner#run : " + Thread.currentThread().getName()); // main
        publisher.publishEvent(new MyEvent(this, "hello spring event"));
    }
}

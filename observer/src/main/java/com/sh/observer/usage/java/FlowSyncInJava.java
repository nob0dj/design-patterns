package com.sh.observer.usage.java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowSyncInJava {

    public static void main(String[] args) throws InterruptedException {
        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("hello world");
                subscriber.onComplete();
            }
        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.print("onSubscribe : ");
                System.out.println(subscription);
                this.subscription = subscription;
            }

            @Override
            public void onNext(String item) {
                System.out.print("onNext : " );
                System.out.println(item);
                System.out.println(Thread.currentThread().getName()); // main
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete!");
            }
        };

        publisher.subscribe(subscriber);
        System.out.println("프로그램 종료!");
    }
}

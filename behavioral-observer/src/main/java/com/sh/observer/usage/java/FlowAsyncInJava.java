package com.sh.observer.usage.java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowAsyncInJava {

    public static void main(String[] args) throws InterruptedException {
        Flow.Publisher<String> publisher = new SubmissionPublisher<>();

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
//                System.out.print("onSubscribe : " + subscription); // Not Working
                System.out.print("onSubscribe : ");
                System.out.println(subscription);
                this.subscription = subscription;
                this.subscription.request(1); // 1개 item 요청 (back pressure 조정용)
            }

            @Override
            public void onNext(String item) {
                System.out.print("onNext : ");
                System.out.println(item);
                System.out.println(Thread.currentThread().getName());
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        publisher.subscribe(subscriber);

        ((SubmissionPublisher) publisher).submit("hello java");

        System.out.println("프로그램 종료!");
    }
}

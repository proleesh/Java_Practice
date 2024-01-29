package com.proleesh.ex31;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Publisher
         * 2. Subscriber
         * 3. Subscription
         */

        // 1. publisher definition
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();


        // 2. subscriber definition
        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>(){

            private Flow.Subscription subscription;
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println(Thread.currentThread() + " Subscription Start: " + subscription);
                this.subscription = subscription;

                // 从上游请求一个数据
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println(Thread.currentThread() + " Subscriber response data: " + item);
                subscription.request(1);
                if(item.equals("p - 7")){
                    subscription.cancel();
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(Thread.currentThread() + " Subscriber Error data: " + throwable);

            }

            @Override
            public void onComplete() {
                System.out.println(Thread.currentThread() + " Subscriber Complete");
            }
        };
        Flow.Subscriber<String> subscriber2 = new Flow.Subscriber<String>(){

            private Flow.Subscription subscription;
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println(Thread.currentThread() + " >>>Subscription Start: " + subscription);
                this.subscription = subscription;

                // 从上游请求一个数据
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println(Thread.currentThread() + " >>>Subscriber response data: " + item);
                subscription.request(1);
//                if(item.equals("p - 7")){
//                    subscription.cancel();
//                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(Thread.currentThread() + " >>>Subscriber Error data: " + throwable);

            }

            @Override
            public void onComplete() {
                System.out.println(Thread.currentThread() + " >>>Subscriber Complete");
            }
        };


        // 3. 绑定发布者和订阅者
        publisher.subscribe(subscriber);
        publisher.subscribe(subscriber2);

        for (int i = 0; i < 10; i++) {
//            if(i >= 9){
//                publisher.closeExceptionally(new RuntimeException("number biggest 9, not working"));
//
//            }else {
            if(i == 5){
//                publisher.closeExceptionally(new RuntimeException("55555"));
            }else {
                publisher.submit("p - " + i);
            }
//            }
        }
        publisher.close();



        Thread.sleep(2000);

        // 发布者有数据， 订阅者就会拿到
    }
}

package com.concurrency.framework.collections.nonblocking;

import java.util.concurrent.ConcurrentLinkedDeque;


/**
 * Created by mzavgorodny on 4/9/14.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ConcurrentLinkedDeque<String> queue = new ConcurrentLinkedDeque<String>();

        Thread producer1 = new Thread(new ProducerNoBlocking1(queue));
        Thread producer2 = new Thread(new ProducerNoBlocking2(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer1.start();
        producer2.start();
        consumer.start();
    }
}

package com.concurrency.framework.synchronize.conditions;

/**
 * Created by mzavgorodny on 3/20/14.
 */
public class Producer implements Runnable {

    private QueueCar q;

    Producer(QueueCar q) {
        this.q = q;
        new Thread(this, "ProducerNoBlocking1").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

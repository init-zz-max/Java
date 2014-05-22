package com.concurrency.framework.synchronize.conditions;

/**
 * Created by mzavgorodny on 3/20/14.
 */
public class Main {

    public static void main(String args[]) {
        QueueCar q = new QueueCar();

        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stop.");
    }
}

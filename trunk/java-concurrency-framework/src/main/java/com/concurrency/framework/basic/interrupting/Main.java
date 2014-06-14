package com.concurrency.framework.basic.interrupting;

/**
 * Created by mzavgorodny on 3/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        task.start();

        System.out.println("task.interrupt() = " + task.isInterrupted());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.interrupt();
        System.out.println("task.interrupt() = " + task.isInterrupted());

    }
}

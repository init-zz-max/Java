package com.concurrency.framework.basic.creating;

/**
 * Created by mzavgorodny on basic.thread.thread.b.basic.thread.b_basic_thread_synchronization/28/14.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            CalculatorRunnable calculator = new CalculatorRunnable(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}

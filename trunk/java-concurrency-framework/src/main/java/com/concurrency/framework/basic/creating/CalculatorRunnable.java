package com.concurrency.framework.basic.creating;

/**
 * Created by mzavgorodny on basic.thread.thread.b.basic.thread.b_basic_thread_synchronization/28/14.
 */
public class CalculatorRunnable implements Runnable {
    private int number;

    public CalculatorRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number);
        }
    }
}

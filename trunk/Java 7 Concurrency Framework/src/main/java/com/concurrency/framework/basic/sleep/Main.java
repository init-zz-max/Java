package com.concurrency.framework.basic.sleep;

import java.util.concurrent.TimeUnit;

/**
 * Created by mzavgorodny on 3/3/14.
 */
public class Main {

    public static void main(String[] args) {
        FileClock clock = new FileClock();
        Thread thread = new Thread(clock);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.printf("Main2 interrupted");
        }
        thread.interrupt();
        thread.stop();
        //thread.destroy();
    }
}

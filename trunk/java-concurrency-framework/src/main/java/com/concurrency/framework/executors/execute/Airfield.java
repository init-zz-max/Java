package com.concurrency.framework.executors.execute;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by mzavgorodny on 4/2/14.
 */
public class Airfield implements Runnable {

    private Date initDate;
    private String name;

    public Airfield(String name) {
        initDate = new Date();
        this.name = name;
    }

    @Override
    public void run() {
        try {
            long duration = (long) (Math.random() * 5) + 1;
            TimeUnit.SECONDS.sleep(duration);
            System.out.printf("%s: %s: launching %d seconds\n", Thread.currentThread().getName(), name, duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

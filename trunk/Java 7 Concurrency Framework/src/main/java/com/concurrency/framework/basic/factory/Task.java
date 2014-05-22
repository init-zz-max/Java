package com.concurrency.framework.basic.factory;

import java.util.concurrent.TimeUnit;

/**
 * Created by mzavgorodny on 3/6/14.
 */
public class Task implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

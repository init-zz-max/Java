package com.concurrency.framework.executors.periodically;


import java.util.Date;

/**
 * Created by mzavgorodny on 4/4/14.
 */
public class PeriodicallyTask implements Runnable {

    private String name;

    public PeriodicallyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Spaceship has launched " + new Date());
    }
}

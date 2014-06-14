package com.concurrency.framework.basic.atomic;

/**
 * Created by mzavgorodny on 4/11/14.
 */
public class Task implements Runnable {

    private AtomicCounter atomicCounter;

    public Task(AtomicCounter atomicCounter) {
        this.atomicCounter = atomicCounter;
    }

    @Override
    public void run() {
        atomicCounter.increment();
    }
}

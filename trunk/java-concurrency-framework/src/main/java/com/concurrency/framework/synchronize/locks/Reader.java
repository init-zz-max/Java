package com.concurrency.framework.synchronize.locks;

/**
 * Created by mzavgorodny on 3/21/14.
 */
public class Reader implements Runnable {

    private PricesExchange pricesExchange;

    public Reader(PricesExchange pricesExchange) {
        this.pricesExchange = pricesExchange;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf(i + " %s: Price 1: %f\n", Thread.currentThread().getName(), pricesExchange.getPrice1());
            System.out.printf(i + " %s: Price 2: %f\n", Thread.currentThread().getName(), pricesExchange.getPrice2());
        }
    }

}

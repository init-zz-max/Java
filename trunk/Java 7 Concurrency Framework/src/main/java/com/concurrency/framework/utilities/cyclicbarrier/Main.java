package com.concurrency.framework.utilities.cyclicbarrier;

/**
 * Created by mzavgorodny on 3/26/14.
 */
public class Main {

    public static void main(String args[]) {
        ServiceMan serviceMan = new ServiceMan(3);

        for (int i = 0; i < 6; i++) {
            new Thread(new Printer(serviceMan, "PrinterDevice" + (i + 1))).start();
        }
    }
}

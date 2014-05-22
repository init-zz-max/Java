package com.concurrency.framework.utilities.countdownlatch;

/**
 * Created by mzavgorodny on 3/26/14.
 */
public class VideoConference1 extends VideoConference {

    public VideoConference1(int number) {
        super(number);
    }

    @Override
    public void run() {
        System.out.printf("VideoConference 1: Initialization: %d participants.\n", countDownLatch.getCount());
        try {
            countDownLatch.await();
            System.out.printf("VideoConference 1: All the participants have come\n");
            System.out.printf("VideoConference 1: Let's start...\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

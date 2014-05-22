package com.concurrency.framework.forkjoin.framework.forkjoinsum;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by mzavgorodny on 5/4/14.
 */
public class MaximumFinder extends RecursiveTask<Integer> {

    private static final int SEQUENTIAL_THRESHOLD = 5;

    private final int[] data;
    private final int start;
    private final int end;

    public MaximumFinder(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    public MaximumFinder(int[] data) {
        this(data, 0, data.length);
    }

    public static void main(String[] args) {
        // create a random data set
        int[] data = new int[1000];
        initData(data);

        final ForkJoinPool pool = new ForkJoinPool(4);
        final MaximumFinder finder = new MaximumFinder(data);

        System.out.println(pool.invoke(finder));
    }

    @Override
    protected Integer compute() {
        final int length = end - start;
        if (length < SEQUENTIAL_THRESHOLD) {
            return computeDirectly();
        }

        final int split = length / 2;
        final MaximumFinder left = new MaximumFinder(data, start, start + split);
        left.fork();
        final MaximumFinder right = new MaximumFinder(data, start + split, end);
        return Math.max(right.compute(), left.join());
    }

    private Integer computeDirectly() {
        System.out.println(Thread.currentThread() + " computing: " + start + " to " + end);
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    private static void initData(int[] data) {
        final Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }
    }
}
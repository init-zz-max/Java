package com.concurrency.framework.executors.controlfinishing;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by mzavgorodny on 4/4/14.
 */
public class ResultTask extends FutureTask<String> {

    private String name;

    public ResultTask(Callable<String> callable) {
        super(callable);
        this.name = ((ExecutableTask) callable).getName();
    }

    @Override
    protected void done() {
        if (isCancelled()) {
            System.out.println(name + " Has been canceled");
        } else {
            System.out.println(name + " Has finished preparation");
        }
    }

}

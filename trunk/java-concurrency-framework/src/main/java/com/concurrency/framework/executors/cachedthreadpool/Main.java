package com.concurrency.framework.executors.cachedthreadpool;

/**
 * Created by mzavgorodny on 4/2/14.
 */
public class Main {

    public static void main(String[] args) {

     /*   Thread t = new Thread(new PeriodicallyTask("1"));
        t.start();*/

        Server server = new Server();
        for (int i = 0; i < 10; i++) {
            Task task = new Task("PeriodicallyTask " + i);
            server.executeTask(task);
        }

        server.endServer();
    }

}

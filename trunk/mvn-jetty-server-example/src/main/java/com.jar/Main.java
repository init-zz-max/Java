package com.jar;


import com.jar.hendlers.HelloJetty;
import org.eclipse.jetty.server.Server;

/**
 * Created by mzavgorodny on 4/25/14.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(new HelloJetty());

        server.start();
        server.join();
    }

}

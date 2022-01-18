package org.hps;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerThread extends Thread {

    public void run(){
        Server server;
        server = ServerBuilder
                .forPort(8080)
                .addService(new RateServiceImpl()).build();
        System.out.println("Server Started");
        System.out.println("Now can serve Rates:");

        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
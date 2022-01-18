package org.hps;

import io.grpc.stub.StreamObserver;

import java.util.Random;


public class RateServiceImpl extends RateServiceGrpc.RateServiceImplBase {

    Random rnd = new Random();


    @Override
    public void rate (RateRequest request, StreamObserver<RateResponse> responseObserver) {

        System.out.println("received the following rate  request " + request.toString());


        RateResponse response = RateResponse.newBuilder()
                .setRateresponse( String.valueOf(rnd.nextDouble()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
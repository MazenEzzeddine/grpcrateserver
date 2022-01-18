package org.hps;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rate.proto")
public final class RateServiceGrpc {

  private RateServiceGrpc() {}

  public static final String SERVICE_NAME = "RateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RateRequest,
      RateResponse> getRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rate",
      requestType = RateRequest.class,
      responseType = RateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RateRequest,
      RateResponse> getRateMethod() {
    io.grpc.MethodDescriptor<RateRequest, RateResponse> getRateMethod;
    if ((getRateMethod = RateServiceGrpc.getRateMethod) == null) {
      synchronized (RateServiceGrpc.class) {
        if ((getRateMethod = RateServiceGrpc.getRateMethod) == null) {
          RateServiceGrpc.getRateMethod = getRateMethod =
              io.grpc.MethodDescriptor.<RateRequest, RateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RateServiceMethodDescriptorSupplier("Rate"))
              .build();
        }
      }
    }
    return getRateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RateServiceStub>() {
        @Override
        public RateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RateServiceStub(channel, callOptions);
        }
      };
    return RateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RateServiceBlockingStub>() {
        @Override
        public RateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RateServiceBlockingStub(channel, callOptions);
        }
      };
    return RateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RateServiceFutureStub>() {
        @Override
        public RateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RateServiceFutureStub(channel, callOptions);
        }
      };
    return RateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void rate(RateRequest request,
                     io.grpc.stub.StreamObserver<RateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRateMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                RateRequest,
                RateResponse>(
                  this, METHODID_RATE)))
          .build();
    }
  }

  /**
   */
  public static final class RateServiceStub extends io.grpc.stub.AbstractAsyncStub<RateServiceStub> {
    private RateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RateServiceStub(channel, callOptions);
    }

    /**
     */
    public void rate(RateRequest request,
                     io.grpc.stub.StreamObserver<RateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RateServiceBlockingStub> {
    private RateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public RateResponse rate(RateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RateServiceFutureStub> {
    private RateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RateResponse> rate(
        RateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RATE:
          serviceImpl.rate((RateRequest) request,
              (io.grpc.stub.StreamObserver<RateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RateServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Rate.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RateService");
    }
  }

  private static final class RateServiceFileDescriptorSupplier
      extends RateServiceBaseDescriptorSupplier {
    RateServiceFileDescriptorSupplier() {}
  }

  private static final class RateServiceMethodDescriptorSupplier
      extends RateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RateServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RateServiceFileDescriptorSupplier())
              .addMethod(getRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

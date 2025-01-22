package com.example.grpc.city;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: City.proto")
public final class CityServiceProtoGrpc {

  private CityServiceProtoGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.city.CityServiceProto";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.city.CityOuterClass.FindCityMessage,
      com.example.grpc.city.CityOuterClass.City> METHOD_FIND_BY_NAME =
      io.grpc.MethodDescriptor.<com.example.grpc.city.CityOuterClass.FindCityMessage, com.example.grpc.city.CityOuterClass.City>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.city.CityServiceProto", "FindByName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.city.CityOuterClass.FindCityMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.city.CityOuterClass.City.getDefaultInstance()))
          .setSchemaDescriptor(new CityServiceProtoMethodDescriptorSupplier("FindByName"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CityServiceProtoStub newStub(io.grpc.Channel channel) {
    return new CityServiceProtoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CityServiceProtoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CityServiceProtoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CityServiceProtoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CityServiceProtoFutureStub(channel);
  }

  /**
   */
  public static abstract class CityServiceProtoImplBase implements io.grpc.BindableService {

    /**
     */
    public void findByName(com.example.grpc.city.CityOuterClass.FindCityMessage request,
        io.grpc.stub.StreamObserver<com.example.grpc.city.CityOuterClass.City> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_BY_NAME, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_BY_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.city.CityOuterClass.FindCityMessage,
                com.example.grpc.city.CityOuterClass.City>(
                  this, METHODID_FIND_BY_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class CityServiceProtoStub extends io.grpc.stub.AbstractStub<CityServiceProtoStub> {
    private CityServiceProtoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CityServiceProtoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CityServiceProtoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CityServiceProtoStub(channel, callOptions);
    }

    /**
     */
    public void findByName(com.example.grpc.city.CityOuterClass.FindCityMessage request,
        io.grpc.stub.StreamObserver<com.example.grpc.city.CityOuterClass.City> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_BY_NAME, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CityServiceProtoBlockingStub extends io.grpc.stub.AbstractStub<CityServiceProtoBlockingStub> {
    private CityServiceProtoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CityServiceProtoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CityServiceProtoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CityServiceProtoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.city.CityOuterClass.City findByName(com.example.grpc.city.CityOuterClass.FindCityMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_BY_NAME, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CityServiceProtoFutureStub extends io.grpc.stub.AbstractStub<CityServiceProtoFutureStub> {
    private CityServiceProtoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CityServiceProtoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CityServiceProtoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CityServiceProtoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.city.CityOuterClass.City> findByName(
        com.example.grpc.city.CityOuterClass.FindCityMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_BY_NAME, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_NAME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CityServiceProtoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CityServiceProtoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_NAME:
          serviceImpl.findByName((com.example.grpc.city.CityOuterClass.FindCityMessage) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.city.CityOuterClass.City>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CityServiceProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CityServiceProtoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.city.CityOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CityServiceProto");
    }
  }

  private static final class CityServiceProtoFileDescriptorSupplier
      extends CityServiceProtoBaseDescriptorSupplier {
    CityServiceProtoFileDescriptorSupplier() {}
  }

  private static final class CityServiceProtoMethodDescriptorSupplier
      extends CityServiceProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CityServiceProtoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CityServiceProtoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CityServiceProtoFileDescriptorSupplier())
              .addMethod(METHOD_FIND_BY_NAME)
              .build();
        }
      }
    }
    return result;
  }
}

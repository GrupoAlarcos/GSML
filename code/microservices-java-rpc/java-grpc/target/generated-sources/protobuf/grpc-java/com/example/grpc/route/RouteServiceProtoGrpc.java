package com.example.grpc.route;

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
    comments = "Source: Route.proto")
public final class RouteServiceProtoGrpc {

  private RouteServiceProtoGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.route.RouteServiceProto";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.route.Route.FindRouteMessage,
      com.example.grpc.route.Route.ShortRoute> METHOD_FIND_SHORTEST_ROUTE =
      io.grpc.MethodDescriptor.<com.example.grpc.route.Route.FindRouteMessage, com.example.grpc.route.Route.ShortRoute>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.route.RouteServiceProto", "FindShortestRoute"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.route.Route.FindRouteMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.route.Route.ShortRoute.getDefaultInstance()))
          .setSchemaDescriptor(new RouteServiceProtoMethodDescriptorSupplier("FindShortestRoute"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteServiceProtoStub newStub(io.grpc.Channel channel) {
    return new RouteServiceProtoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteServiceProtoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouteServiceProtoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteServiceProtoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouteServiceProtoFutureStub(channel);
  }

  /**
   */
  public static abstract class RouteServiceProtoImplBase implements io.grpc.BindableService {

    /**
     */
    public void findShortestRoute(com.example.grpc.route.Route.FindRouteMessage request,
        io.grpc.stub.StreamObserver<com.example.grpc.route.Route.ShortRoute> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_SHORTEST_ROUTE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_SHORTEST_ROUTE,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.route.Route.FindRouteMessage,
                com.example.grpc.route.Route.ShortRoute>(
                  this, METHODID_FIND_SHORTEST_ROUTE)))
          .build();
    }
  }

  /**
   */
  public static final class RouteServiceProtoStub extends io.grpc.stub.AbstractStub<RouteServiceProtoStub> {
    private RouteServiceProtoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteServiceProtoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteServiceProtoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteServiceProtoStub(channel, callOptions);
    }

    /**
     */
    public void findShortestRoute(com.example.grpc.route.Route.FindRouteMessage request,
        io.grpc.stub.StreamObserver<com.example.grpc.route.Route.ShortRoute> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_SHORTEST_ROUTE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RouteServiceProtoBlockingStub extends io.grpc.stub.AbstractStub<RouteServiceProtoBlockingStub> {
    private RouteServiceProtoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteServiceProtoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteServiceProtoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteServiceProtoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.route.Route.ShortRoute findShortestRoute(com.example.grpc.route.Route.FindRouteMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_SHORTEST_ROUTE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RouteServiceProtoFutureStub extends io.grpc.stub.AbstractStub<RouteServiceProtoFutureStub> {
    private RouteServiceProtoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteServiceProtoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteServiceProtoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteServiceProtoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.route.Route.ShortRoute> findShortestRoute(
        com.example.grpc.route.Route.FindRouteMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_SHORTEST_ROUTE, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_SHORTEST_ROUTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteServiceProtoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteServiceProtoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_SHORTEST_ROUTE:
          serviceImpl.findShortestRoute((com.example.grpc.route.Route.FindRouteMessage) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.route.Route.ShortRoute>) responseObserver);
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

  private static abstract class RouteServiceProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteServiceProtoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.route.Route.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteServiceProto");
    }
  }

  private static final class RouteServiceProtoFileDescriptorSupplier
      extends RouteServiceProtoBaseDescriptorSupplier {
    RouteServiceProtoFileDescriptorSupplier() {}
  }

  private static final class RouteServiceProtoMethodDescriptorSupplier
      extends RouteServiceProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteServiceProtoMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouteServiceProtoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteServiceProtoFileDescriptorSupplier())
              .addMethod(METHOD_FIND_SHORTEST_ROUTE)
              .build();
        }
      }
    }
    return result;
  }
}

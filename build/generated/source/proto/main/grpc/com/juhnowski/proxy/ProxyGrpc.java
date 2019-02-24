package com.juhnowski.proxy;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: greeting.proto")
public final class ProxyGrpc {

  private ProxyGrpc() {}

  public static final String SERVICE_NAME = "com.juhnowski.proxy.Proxy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proxy",
      requestType = com.juhnowski.proxy.MsgRequest.class,
      responseType = com.juhnowski.proxy.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getProxyMethod() {
    io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply> getProxyMethod;
    if ((getProxyMethod = ProxyGrpc.getProxyMethod) == null) {
      synchronized (ProxyGrpc.class) {
        if ((getProxyMethod = ProxyGrpc.getProxyMethod) == null) {
          ProxyGrpc.getProxyMethod = getProxyMethod = 
              io.grpc.MethodDescriptor.<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.juhnowski.proxy.Proxy", "Proxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyMethodDescriptorSupplier("Proxy"))
                  .build();
          }
        }
     }
     return getProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getMsgServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgServerStream",
      requestType = com.juhnowski.proxy.MsgRequest.class,
      responseType = com.juhnowski.proxy.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getMsgServerStreamMethod() {
    io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply> getMsgServerStreamMethod;
    if ((getMsgServerStreamMethod = ProxyGrpc.getMsgServerStreamMethod) == null) {
      synchronized (ProxyGrpc.class) {
        if ((getMsgServerStreamMethod = ProxyGrpc.getMsgServerStreamMethod) == null) {
          ProxyGrpc.getMsgServerStreamMethod = getMsgServerStreamMethod = 
              io.grpc.MethodDescriptor.<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.juhnowski.proxy.Proxy", "MsgServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyMethodDescriptorSupplier("MsgServerStream"))
                  .build();
          }
        }
     }
     return getMsgServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getMsgClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgClientStream",
      requestType = com.juhnowski.proxy.MsgRequest.class,
      responseType = com.juhnowski.proxy.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getMsgClientStreamMethod() {
    io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply> getMsgClientStreamMethod;
    if ((getMsgClientStreamMethod = ProxyGrpc.getMsgClientStreamMethod) == null) {
      synchronized (ProxyGrpc.class) {
        if ((getMsgClientStreamMethod = ProxyGrpc.getMsgClientStreamMethod) == null) {
          ProxyGrpc.getMsgClientStreamMethod = getMsgClientStreamMethod = 
              io.grpc.MethodDescriptor.<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.juhnowski.proxy.Proxy", "MsgClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyMethodDescriptorSupplier("MsgClientStream"))
                  .build();
          }
        }
     }
     return getMsgClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getMsgBidirectionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgBidirectional",
      requestType = com.juhnowski.proxy.MsgRequest.class,
      responseType = com.juhnowski.proxy.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest,
      com.juhnowski.proxy.MsgReply> getMsgBidirectionalMethod() {
    io.grpc.MethodDescriptor<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply> getMsgBidirectionalMethod;
    if ((getMsgBidirectionalMethod = ProxyGrpc.getMsgBidirectionalMethod) == null) {
      synchronized (ProxyGrpc.class) {
        if ((getMsgBidirectionalMethod = ProxyGrpc.getMsgBidirectionalMethod) == null) {
          ProxyGrpc.getMsgBidirectionalMethod = getMsgBidirectionalMethod = 
              io.grpc.MethodDescriptor.<com.juhnowski.proxy.MsgRequest, com.juhnowski.proxy.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.juhnowski.proxy.Proxy", "MsgBidirectional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juhnowski.proxy.MsgReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyMethodDescriptorSupplier("MsgBidirectional"))
                  .build();
          }
        }
     }
     return getMsgBidirectionalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProxyStub newStub(io.grpc.Channel channel) {
    return new ProxyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProxyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProxyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProxyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProxyFutureStub(channel);
  }

  /**
   */
  public static abstract class ProxyImplBase implements io.grpc.BindableService {

    /**
     */
    public void proxy(com.juhnowski.proxy.MsgRequest request,
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      asyncUnimplementedUnaryCall(getProxyMethod(), responseObserver);
    }

    /**
     */
    public void msgServerStream(com.juhnowski.proxy.MsgRequest request,
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      asyncUnimplementedUnaryCall(getMsgServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgRequest> msgClientStream(
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getMsgClientStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgRequest> msgBidirectional(
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getMsgBidirectionalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProxyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.juhnowski.proxy.MsgRequest,
                com.juhnowski.proxy.MsgReply>(
                  this, METHODID_PROXY)))
          .addMethod(
            getMsgServerStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.juhnowski.proxy.MsgRequest,
                com.juhnowski.proxy.MsgReply>(
                  this, METHODID_MSG_SERVER_STREAM)))
          .addMethod(
            getMsgClientStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.juhnowski.proxy.MsgRequest,
                com.juhnowski.proxy.MsgReply>(
                  this, METHODID_MSG_CLIENT_STREAM)))
          .addMethod(
            getMsgBidirectionalMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.juhnowski.proxy.MsgRequest,
                com.juhnowski.proxy.MsgReply>(
                  this, METHODID_MSG_BIDIRECTIONAL)))
          .build();
    }
  }

  /**
   */
  public static final class ProxyStub extends io.grpc.stub.AbstractStub<ProxyStub> {
    private ProxyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProxyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProxyStub(channel, callOptions);
    }

    /**
     */
    public void proxy(com.juhnowski.proxy.MsgRequest request,
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgServerStream(com.juhnowski.proxy.MsgRequest request,
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMsgServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgRequest> msgClientStream(
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMsgClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgRequest> msgBidirectional(
        io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMsgBidirectionalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ProxyBlockingStub extends io.grpc.stub.AbstractStub<ProxyBlockingStub> {
    private ProxyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProxyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProxyBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.juhnowski.proxy.MsgReply proxy(com.juhnowski.proxy.MsgRequest request) {
      return blockingUnaryCall(
          getChannel(), getProxyMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.juhnowski.proxy.MsgReply> msgServerStream(
        com.juhnowski.proxy.MsgRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMsgServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProxyFutureStub extends io.grpc.stub.AbstractStub<ProxyFutureStub> {
    private ProxyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProxyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProxyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juhnowski.proxy.MsgReply> proxy(
        com.juhnowski.proxy.MsgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProxyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROXY = 0;
  private static final int METHODID_MSG_SERVER_STREAM = 1;
  private static final int METHODID_MSG_CLIENT_STREAM = 2;
  private static final int METHODID_MSG_BIDIRECTIONAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProxyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProxyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROXY:
          serviceImpl.proxy((com.juhnowski.proxy.MsgRequest) request,
              (io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply>) responseObserver);
          break;
        case METHODID_MSG_SERVER_STREAM:
          serviceImpl.msgServerStream((com.juhnowski.proxy.MsgRequest) request,
              (io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply>) responseObserver);
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
        case METHODID_MSG_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.msgClientStream(
              (io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply>) responseObserver);
        case METHODID_MSG_BIDIRECTIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.msgBidirectional(
              (io.grpc.stub.StreamObserver<com.juhnowski.proxy.MsgReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProxyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.juhnowski.proxy.Greeting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Proxy");
    }
  }

  private static final class ProxyFileDescriptorSupplier
      extends ProxyBaseDescriptorSupplier {
    ProxyFileDescriptorSupplier() {}
  }

  private static final class ProxyMethodDescriptorSupplier
      extends ProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProxyMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProxyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProxyFileDescriptorSupplier())
              .addMethod(getProxyMethod())
              .addMethod(getMsgServerStreamMethod())
              .addMethod(getMsgClientStreamMethod())
              .addMethod(getMsgBidirectionalMethod())
              .build();
        }
      }
    }
    return result;
  }
}

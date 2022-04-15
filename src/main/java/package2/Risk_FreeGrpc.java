package package2;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class Risk_FreeGrpc {

  private Risk_FreeGrpc() {}

  public static final String SERVICE_NAME = "Risk_Free";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<package2.positions,
      package2.thanks> getCovidPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "covid_positions",
      requestType = package2.positions.class,
      responseType = package2.thanks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<package2.positions,
      package2.thanks> getCovidPositionsMethod() {
    io.grpc.MethodDescriptor<package2.positions, package2.thanks> getCovidPositionsMethod;
    if ((getCovidPositionsMethod = Risk_FreeGrpc.getCovidPositionsMethod) == null) {
      synchronized (Risk_FreeGrpc.class) {
        if ((getCovidPositionsMethod = Risk_FreeGrpc.getCovidPositionsMethod) == null) {
          Risk_FreeGrpc.getCovidPositionsMethod = getCovidPositionsMethod = 
              io.grpc.MethodDescriptor.<package2.positions, package2.thanks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Risk_Free", "covid_positions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package2.positions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package2.thanks.getDefaultInstance()))
                  .setSchemaDescriptor(new Risk_FreeMethodDescriptorSupplier("covid_positions"))
                  .build();
          }
        }
     }
     return getCovidPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<package2.request,
      package2.positions> getSafeZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "safe_zones",
      requestType = package2.request.class,
      responseType = package2.positions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<package2.request,
      package2.positions> getSafeZonesMethod() {
    io.grpc.MethodDescriptor<package2.request, package2.positions> getSafeZonesMethod;
    if ((getSafeZonesMethod = Risk_FreeGrpc.getSafeZonesMethod) == null) {
      synchronized (Risk_FreeGrpc.class) {
        if ((getSafeZonesMethod = Risk_FreeGrpc.getSafeZonesMethod) == null) {
          Risk_FreeGrpc.getSafeZonesMethod = getSafeZonesMethod = 
              io.grpc.MethodDescriptor.<package2.request, package2.positions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Risk_Free", "safe_zones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package2.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package2.positions.getDefaultInstance()))
                  .setSchemaDescriptor(new Risk_FreeMethodDescriptorSupplier("safe_zones"))
                  .build();
          }
        }
     }
     return getSafeZonesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<package2.positions,
      package2.ifSafe> getInsideSafeZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inside_safe_zones",
      requestType = package2.positions.class,
      responseType = package2.ifSafe.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<package2.positions,
      package2.ifSafe> getInsideSafeZonesMethod() {
    io.grpc.MethodDescriptor<package2.positions, package2.ifSafe> getInsideSafeZonesMethod;
    if ((getInsideSafeZonesMethod = Risk_FreeGrpc.getInsideSafeZonesMethod) == null) {
      synchronized (Risk_FreeGrpc.class) {
        if ((getInsideSafeZonesMethod = Risk_FreeGrpc.getInsideSafeZonesMethod) == null) {
          Risk_FreeGrpc.getInsideSafeZonesMethod = getInsideSafeZonesMethod = 
              io.grpc.MethodDescriptor.<package2.positions, package2.ifSafe>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Risk_Free", "inside_safe_zones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package2.positions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package2.ifSafe.getDefaultInstance()))
                  .setSchemaDescriptor(new Risk_FreeMethodDescriptorSupplier("inside_safe_zones"))
                  .build();
          }
        }
     }
     return getInsideSafeZonesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Risk_FreeStub newStub(io.grpc.Channel channel) {
    return new Risk_FreeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Risk_FreeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Risk_FreeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Risk_FreeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Risk_FreeFutureStub(channel);
  }

  /**
   */
  public static abstract class Risk_FreeImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<package2.positions> covidPositions(
        io.grpc.stub.StreamObserver<package2.thanks> responseObserver) {
      return asyncUnimplementedStreamingCall(getCovidPositionsMethod(), responseObserver);
    }

    /**
     */
    public void safeZones(package2.request request,
        io.grpc.stub.StreamObserver<package2.positions> responseObserver) {
      asyncUnimplementedUnaryCall(getSafeZonesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<package2.positions> insideSafeZones(
        io.grpc.stub.StreamObserver<package2.ifSafe> responseObserver) {
      return asyncUnimplementedStreamingCall(getInsideSafeZonesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCovidPositionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                package2.positions,
                package2.thanks>(
                  this, METHODID_COVID_POSITIONS)))
          .addMethod(
            getSafeZonesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                package2.request,
                package2.positions>(
                  this, METHODID_SAFE_ZONES)))
          .addMethod(
            getInsideSafeZonesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                package2.positions,
                package2.ifSafe>(
                  this, METHODID_INSIDE_SAFE_ZONES)))
          .build();
    }
  }

  /**
   */
  public static final class Risk_FreeStub extends io.grpc.stub.AbstractStub<Risk_FreeStub> {
    private Risk_FreeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Risk_FreeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Risk_FreeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Risk_FreeStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<package2.positions> covidPositions(
        io.grpc.stub.StreamObserver<package2.thanks> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCovidPositionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void safeZones(package2.request request,
        io.grpc.stub.StreamObserver<package2.positions> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSafeZonesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<package2.positions> insideSafeZones(
        io.grpc.stub.StreamObserver<package2.ifSafe> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInsideSafeZonesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Risk_FreeBlockingStub extends io.grpc.stub.AbstractStub<Risk_FreeBlockingStub> {
    private Risk_FreeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Risk_FreeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Risk_FreeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Risk_FreeBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<package2.positions> safeZones(
        package2.request request) {
      return blockingServerStreamingCall(
          getChannel(), getSafeZonesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Risk_FreeFutureStub extends io.grpc.stub.AbstractStub<Risk_FreeFutureStub> {
    private Risk_FreeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Risk_FreeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Risk_FreeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Risk_FreeFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAFE_ZONES = 0;
  private static final int METHODID_COVID_POSITIONS = 1;
  private static final int METHODID_INSIDE_SAFE_ZONES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Risk_FreeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Risk_FreeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAFE_ZONES:
          serviceImpl.safeZones((package2.request) request,
              (io.grpc.stub.StreamObserver<package2.positions>) responseObserver);
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
        case METHODID_COVID_POSITIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.covidPositions(
              (io.grpc.stub.StreamObserver<package2.thanks>) responseObserver);
        case METHODID_INSIDE_SAFE_ZONES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.insideSafeZones(
              (io.grpc.stub.StreamObserver<package2.ifSafe>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Risk_FreeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Risk_FreeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return package2.outerClass2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Risk_Free");
    }
  }

  private static final class Risk_FreeFileDescriptorSupplier
      extends Risk_FreeBaseDescriptorSupplier {
    Risk_FreeFileDescriptorSupplier() {}
  }

  private static final class Risk_FreeMethodDescriptorSupplier
      extends Risk_FreeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Risk_FreeMethodDescriptorSupplier(String methodName) {
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
      synchronized (Risk_FreeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Risk_FreeFileDescriptorSupplier())
              .addMethod(getCovidPositionsMethod())
              .addMethod(getSafeZonesMethod())
              .addMethod(getInsideSafeZonesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

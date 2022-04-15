package package3;

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
    comments = "Source: service3.proto")
public final class VaccinationGrpc {

  private VaccinationGrpc() {}

  public static final String SERVICE_NAME = "Vaccination";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<package3.userId,
      package3.hadVaccination> getVaccinationHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vaccination_history",
      requestType = package3.userId.class,
      responseType = package3.hadVaccination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<package3.userId,
      package3.hadVaccination> getVaccinationHistoryMethod() {
    io.grpc.MethodDescriptor<package3.userId, package3.hadVaccination> getVaccinationHistoryMethod;
    if ((getVaccinationHistoryMethod = VaccinationGrpc.getVaccinationHistoryMethod) == null) {
      synchronized (VaccinationGrpc.class) {
        if ((getVaccinationHistoryMethod = VaccinationGrpc.getVaccinationHistoryMethod) == null) {
          VaccinationGrpc.getVaccinationHistoryMethod = getVaccinationHistoryMethod = 
              io.grpc.MethodDescriptor.<package3.userId, package3.hadVaccination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Vaccination", "vaccination_history"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package3.userId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package3.hadVaccination.getDefaultInstance()))
                  .setSchemaDescriptor(new VaccinationMethodDescriptorSupplier("vaccination_history"))
                  .build();
          }
        }
     }
     return getVaccinationHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<package3.request,
      package3.availableDate> getSeeAvailableDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "see_available_dates",
      requestType = package3.request.class,
      responseType = package3.availableDate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<package3.request,
      package3.availableDate> getSeeAvailableDatesMethod() {
    io.grpc.MethodDescriptor<package3.request, package3.availableDate> getSeeAvailableDatesMethod;
    if ((getSeeAvailableDatesMethod = VaccinationGrpc.getSeeAvailableDatesMethod) == null) {
      synchronized (VaccinationGrpc.class) {
        if ((getSeeAvailableDatesMethod = VaccinationGrpc.getSeeAvailableDatesMethod) == null) {
          VaccinationGrpc.getSeeAvailableDatesMethod = getSeeAvailableDatesMethod = 
              io.grpc.MethodDescriptor.<package3.request, package3.availableDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Vaccination", "see_available_dates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package3.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  package3.availableDate.getDefaultInstance()))
                  .setSchemaDescriptor(new VaccinationMethodDescriptorSupplier("see_available_dates"))
                  .build();
          }
        }
     }
     return getSeeAvailableDatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VaccinationStub newStub(io.grpc.Channel channel) {
    return new VaccinationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VaccinationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VaccinationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VaccinationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VaccinationFutureStub(channel);
  }

  /**
   */
  public static abstract class VaccinationImplBase implements io.grpc.BindableService {

    /**
     */
    public void vaccinationHistory(package3.userId request,
        io.grpc.stub.StreamObserver<package3.hadVaccination> responseObserver) {
      asyncUnimplementedUnaryCall(getVaccinationHistoryMethod(), responseObserver);
    }

    /**
     */
    public void seeAvailableDates(package3.request request,
        io.grpc.stub.StreamObserver<package3.availableDate> responseObserver) {
      asyncUnimplementedUnaryCall(getSeeAvailableDatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVaccinationHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                package3.userId,
                package3.hadVaccination>(
                  this, METHODID_VACCINATION_HISTORY)))
          .addMethod(
            getSeeAvailableDatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                package3.request,
                package3.availableDate>(
                  this, METHODID_SEE_AVAILABLE_DATES)))
          .build();
    }
  }

  /**
   */
  public static final class VaccinationStub extends io.grpc.stub.AbstractStub<VaccinationStub> {
    private VaccinationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VaccinationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VaccinationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VaccinationStub(channel, callOptions);
    }

    /**
     */
    public void vaccinationHistory(package3.userId request,
        io.grpc.stub.StreamObserver<package3.hadVaccination> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVaccinationHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seeAvailableDates(package3.request request,
        io.grpc.stub.StreamObserver<package3.availableDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeeAvailableDatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VaccinationBlockingStub extends io.grpc.stub.AbstractStub<VaccinationBlockingStub> {
    private VaccinationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VaccinationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VaccinationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VaccinationBlockingStub(channel, callOptions);
    }

    /**
     */
    public package3.hadVaccination vaccinationHistory(package3.userId request) {
      return blockingUnaryCall(
          getChannel(), getVaccinationHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public package3.availableDate seeAvailableDates(package3.request request) {
      return blockingUnaryCall(
          getChannel(), getSeeAvailableDatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VaccinationFutureStub extends io.grpc.stub.AbstractStub<VaccinationFutureStub> {
    private VaccinationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VaccinationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VaccinationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VaccinationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<package3.hadVaccination> vaccinationHistory(
        package3.userId request) {
      return futureUnaryCall(
          getChannel().newCall(getVaccinationHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<package3.availableDate> seeAvailableDates(
        package3.request request) {
      return futureUnaryCall(
          getChannel().newCall(getSeeAvailableDatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VACCINATION_HISTORY = 0;
  private static final int METHODID_SEE_AVAILABLE_DATES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VaccinationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VaccinationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VACCINATION_HISTORY:
          serviceImpl.vaccinationHistory((package3.userId) request,
              (io.grpc.stub.StreamObserver<package3.hadVaccination>) responseObserver);
          break;
        case METHODID_SEE_AVAILABLE_DATES:
          serviceImpl.seeAvailableDates((package3.request) request,
              (io.grpc.stub.StreamObserver<package3.availableDate>) responseObserver);
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

  private static abstract class VaccinationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VaccinationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return package3.outerClass3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vaccination");
    }
  }

  private static final class VaccinationFileDescriptorSupplier
      extends VaccinationBaseDescriptorSupplier {
    VaccinationFileDescriptorSupplier() {}
  }

  private static final class VaccinationMethodDescriptorSupplier
      extends VaccinationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VaccinationMethodDescriptorSupplier(String methodName) {
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
      synchronized (VaccinationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VaccinationFileDescriptorSupplier())
              .addMethod(getVaccinationHistoryMethod())
              .addMethod(getSeeAvailableDatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

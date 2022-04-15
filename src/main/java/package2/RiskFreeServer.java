package package2;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import package2.Risk_FreeGrpc.Risk_FreeImplBase;

public class RiskFreeServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(50052).addService(new service2()).build();
		server.start();
		server.awaitTermination();
	}
	
	static class service2 extends Risk_FreeImplBase{

		@Override
		public StreamObserver<positions> covidPositions(StreamObserver<thanks> responseObserver) {
			
			return new StreamObserver<positions>() {
				
				@Override
				public void onNext(positions value) {
					System.out.println("On server, message received from the client " + value.getPosition1());
				}

				@Override
				public void onError(Throwable t) {
					
				}

				@Override
				public void onCompleted() {
					thanks.Builder response = thanks.newBuilder();
					response.setThank("Thanks for sharing");
					responseObserver.onNext(response.build());
					responseObserver.onCompleted();
				}
			};
		}

		@Override
		public void safeZones(request request, StreamObserver<positions> responseObserver) {
			
			positions.Builder response = positions.newBuilder();
			
			response.setPosition1("Dublin 01");
			responseObserver.onNext(response.build());
			
			response.setPosition1("Dublin 02");
			responseObserver.onNext(response.build());
			
			response.setPosition1("Dublin 03");
			responseObserver.onNext(response.build());
			
			responseObserver.onCompleted();
		}

		@Override
		public StreamObserver<positions> insideSafeZones(StreamObserver<ifSafe> responseObserver) {
			
			return new StreamObserver<positions>() {

				@Override
				public void onNext(positions value) {

					System.out.println("On server, message received from the client " + value.getPosition1());
					String pos = value.getPosition1();
					int posLen = pos.length();
					
					ifSafe.Builder response = ifSafe.newBuilder();
					
					if(posLen%2==0) {
						response.setSafe(true);
					} else {
						response.setSafe(false);
					}
					
					responseObserver.onNext(response.build());
				}

				@Override
				public void onError(Throwable t) {
				
					
				}

				@Override
				public void onCompleted() {
				
					System.out.println("bidirectional streaming completed ");
					responseObserver.onCompleted();
				}
				
			};
		}
		
		
	}

}

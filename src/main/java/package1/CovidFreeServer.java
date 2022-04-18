package package1;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import package1.CovidFreeGrpc.CovidFreeImplBase;

public class CovidFreeServer {
	
	public static void main(String args []) throws IOException, InterruptedException {
		
		Server server = ServerBuilder.forPort(50051).addService(new service1()).build();
		server.start();
		server.awaitTermination();
	}
	
	static class service1 extends CovidFreeImplBase{

		@Override
		public void riskCalculator(symptoms request, StreamObserver<risk> responseObserver) {
			String symptom1 = request.getSymptom1();
			String symptom2 = request.getSymptom2();
			
			risk.Builder response = risk.newBuilder();
			
			if(!symptom1.equals(symptom2)) {
				
				response.setRisk(50);
			} else {
				int s1 = 0;
				int s2 = 0;
				if(symptom1.equals("true")) {
					s1 = 1;
				}
				if(symptom2.equals("true")) {
					s2 = 1;
				}
				int sT = s1 + s2;
				if(sT==2) {
					response.setRisk(100);
					System.out.println("Be careful");
				}
			}
			
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

		@Override
		public void covidHistory(userId request, StreamObserver<hadCovid> responseObserver) {
			
			int userTestId = request.getId();
			
			hadCovid.Builder response = hadCovid.newBuilder();
			
			if(userTestId%2 == 1) {
				response.setHadC("It is odd");
			} else {
				response.setHadC("It is even");
			}
			
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
			
		}
		
	}

}

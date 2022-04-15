package package3;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import package3.VaccinationGrpc.VaccinationImplBase;

public class VaccinationServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server = ServerBuilder.forPort(50053).addService(new service3()).build();
		server.start();
		server.awaitTermination();
	}
	
	static class service3 extends VaccinationImplBase{

		@Override
		public void vaccinationHistory(userId request, StreamObserver<hadVaccination> responseObserver) {
			
			int vacId = request.getId();
			
			hadVaccination.Builder response = hadVaccination.newBuilder();
			if(vacId%2==1) {
				response.setVaccination(false);
			} else {
				response.setVaccination(true);
			}
			
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
			
		}

		@Override
		public void seeAvailableDates(request request, StreamObserver<availableDate> responseObserver) {
			availableDate.Builder response = availableDate.newBuilder();
			response.setAvailable("Today 1pm");
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
		
		
	}

}

package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.jmdns.ServiceInfo;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import package1.CovidFreeGrpc;
import package2.Risk_FreeGrpc;
import package2.ifSafe;
import package2.positions;
import package2.thanks;
import package3.VaccinationGrpc;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class NewGUIApplication {

	private static CovidFreeGrpc.CovidFreeBlockingStub CFblockingStub;
	private static Risk_FreeGrpc.Risk_FreeBlockingStub RFblockingStub;
	private static Risk_FreeGrpc.Risk_FreeStub Stub;
	private static VaccinationGrpc.VaccinationBlockingStub VCblockingStub;
	
	private JFrame frame;
	private JTextField textName0,textName1,textName2,textName3,textName4,textName5,textName6,textName7,textName8;
	private JTextArea textResponse1,textResponse2,textResponse3 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//overide the run method of runnable
			public void run() {
				try {
					NewGUIApplication window = new NewGUIApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewGUIApplication() {
		
/*
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		 * 
		CFblockingStub = CovidFreeGrpc.newBlockingStub(channel);
		RFblockingStub = Risk_FreeGrpc.newBlockingStub(channel);
		Stub = Risk_FreeGrpc.newStub(channel);
*/	
		initialize();
		/*
		try {
			channel.shutdown().awaitTermination(50, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	private void initialize() {
		frame = new JFrame();
		//Jframe is a window with a title bar
		frame.setTitle("Client - Service Controller");
		//set bounds can be done for frames panels and buttons
		frame.setBounds(100, 100, 500, 250);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Box layout determines how components are laid out in the panel
		//Layout vertically in a col - box layout doesn't wrap
		//See: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		//Create JPanel
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		//Flow layout - items retain their size, are laid out horizontally and wrap

		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Create new label and add it to the panel
		
		JLabel lblNewLabel_0 = new JLabel("   User ID  ");
		panel_service_1.add(lblNewLabel_0);
		textName0 = new JTextField();
		panel_service_1.add(textName0);
		textName0.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("    Fever   ");
		panel_service_1.add(lblNewLabel_1);
		
		//Input textbox
		textName1 = new JTextField();
		// add it to the panel
		panel_service_1.add(textName1);
		//How wide should input box be? - doesn't effect number that can be entered
		textName1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("  Tiredness ");
		panel_service_1.add(lblNewLabel_2);
		
		textName2 = new JTextField();
		panel_service_1.add(textName2);
		textName2.setColumns(10);
		
		String[] ops = new String[] {"Risk Calculator", "Covid History"};
		//Create combobox and add to panel
		JComboBox comboOperation1 = new JComboBox();
		comboOperation1.setModel(new DefaultComboBoxModel(ops));
		panel_service_1.add(comboOperation1);
	
		//Set Up Button ....
		JButton btnSend = new JButton("Check");
		
		//Add an action listener to our button
		btnSend.addActionListener(new ActionListener() {
			
			//implement action performed method
			//This will happen when the button is clicked
			public void actionPerformed(ActionEvent e) {
				
				ServiceInfo serviceInfo;
				String service_type = "_grpc._tcp.local.";
				//Now retrieve the service info - all we are supplying is the service type
				serviceInfo = simpleJMDNS.SimpleServiceDiscovery.run(service_type);
				//Use the serviceInfo to retrieve the port
				//int port = serviceInfo.getPort();
				String host = "localhost";
				int port = 50051;
				

				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host, port)
						.usePlaintext()
						.build();
				
				CFblockingStub = CovidFreeGrpc.newBlockingStub(channel);
				
				int index = comboOperation1.getSelectedIndex();
				//System.out.print(index);
				if(index==0) {
					
				//Do some logic with our index or send it over
					//Retrieve data from GUI
					String name1 = textName1.getText();
					String name2 = textName2.getText();

					package1.symptoms request = package1.symptoms.newBuilder().setSymptom1(name1).setSymptom2(name2).build();
	
					package1.risk response = CFblockingStub.riskCalculator(request);
	
					//System.out.println("Response: " + response);
					
					//populate the JTextArea in the panel
					textResponse1.append("reply: \n"+ response.getRisk() + "\n");
				}
				
				if(index==1) {
					
					int name1 = Integer.parseInt(textName0.getText());
	
				
					package1.userId request = package1.userId.newBuilder().setId(name1).build();
	
					package1.hadCovid response = CFblockingStub.covidHistory(request);
	
					//System.out.println("Response: " + response);
					
					textResponse1.append("reply: \n"+ response.getHadC() + "\n");
				}			

			}
		}); //End of setup button
		
		//Add button to the panel
		panel_service_1.add(btnSend);
		
		
		textResponse1 = new JTextArea(3, 20);
		textResponse1 .setLineWrap(true);
		textResponse1.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse1);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_1.add(scrollPane);
		
		
		
		//Create JPanel
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		//Flow layout - items retain their size, are laid out horizontally and wrap

		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Create new label and add it to the panel
		JLabel lblNewLabel_3 = new JLabel(" Position 1 ");
		panel_service_2.add(lblNewLabel_3);
		
		//Input textbox
		textName3 = new JTextField();
		// add it to the panel
		panel_service_2.add(textName3);
		//How wide should input box be? - doesn't effect number that can be entered
		textName3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" Position 2 ");
		panel_service_2.add(lblNewLabel_4);
		
		textName4 = new JTextField();
		panel_service_2.add(textName4);
		textName4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel(" Position 3 ");
		panel_service_2.add(lblNewLabel_7);
		textName7 = new JTextField();
		panel_service_2.add(textName7);
		textName7.setColumns(10);
		
		String[] ops2 = new String[] {"Covid Positions", "Safe Zones", "Inside Safe Zones"};
		//Create combobox and add to panel
		JComboBox comboOperation2 = new JComboBox();
		comboOperation2.setModel(new DefaultComboBoxModel(ops2));
		panel_service_2.add(comboOperation2);
	
		//Set Up Button ....
		JButton btnSend2 = new JButton("Check");
		
		//Add an action listener to our button
		btnSend2.addActionListener(new ActionListener() {
			
			//implement action performed method
			//This will happen when the button is clicked
			public void actionPerformed(ActionEvent e) {
				
				ServiceInfo serviceInfo;
				String service_type = "_grpc._tcp.local.";
				//Now retrieve the service info - all we are supplying is the service type
				serviceInfo = simpleJMDNS.SimpleServiceDiscovery.run(service_type);
				//Use the serviceInfo to retrieve the port
				//int port = serviceInfo.getPort();
				String host = "localhost";
				int port = 50052;
				
				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host, port)
						.usePlaintext()
						.build();
				RFblockingStub = Risk_FreeGrpc.newBlockingStub(channel);
				Stub = Risk_FreeGrpc.newStub(channel);
				
				int index = comboOperation2.getSelectedIndex();
				
				if(index==0) {
					
					String position1 = textName3.getText();
					String position2 = textName4.getText();
					String position3 = textName7.getText();
					
					StreamObserver<thanks> responseObserver = new StreamObserver<thanks>() {

						@Override
						public void onNext(thanks value) {
							// TODO Auto-generated method stub
							//System.out.println("Final response from server " + value.getThank());
							textResponse2.append(value.getThank() + "\n");
						}

						@Override
						public void onError(Throwable t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void onCompleted() {
							// TODO Auto-generated method stub
							
						}};
						
						StreamObserver<positions> requestObserver = Stub.covidPositions(responseObserver);
						
						requestObserver.onNext(positions.newBuilder().setPosition1(position1).build());
						requestObserver.onNext(positions.newBuilder().setPosition1(position2).build());
						requestObserver.onNext(positions.newBuilder().setPosition1(position3).build());
						requestObserver.onCompleted();
	
				}
				
				if(index==1) {
					
					package2.request request = package2.request.newBuilder().build();
	
					Iterator<package2.positions> responses = RFblockingStub.safeZones(request);
					
					while (responses.hasNext()) {
						package2.positions individualResponse = responses.next();
						textResponse2.append(individualResponse.getPosition1() + "\n");
					}
	
				}
				
				if(index==2) {
					
					String position1 = textName3.getText();
					String position2 = textName4.getText();
					String position3 = textName7.getText();
					
					StreamObserver<ifSafe> responseObserver = new StreamObserver<ifSafe>() {

						@Override
						public void onNext(ifSafe value) {
							textResponse2.append(value.getSafe() + "\n");		
						}

						@Override
						public void onError(Throwable t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void onCompleted() {
							textResponse2.append( "Bi directional Streaming Completed \n");
						}};
						
						StreamObserver<positions> requestObserver = Stub.insideSafeZones(responseObserver);
						
						requestObserver.onNext(positions.newBuilder().setPosition1(position1).build());
						requestObserver.onNext(positions.newBuilder().setPosition1(position2).build());
						requestObserver.onNext(positions.newBuilder().setPosition1(position3).build());
						
						requestObserver.onCompleted();
				}

			}
		}); 
		
		
		panel_service_2.add(btnSend2);
		
		
		textResponse2 = new JTextArea(3, 20);
		textResponse2 .setLineWrap(true);
		textResponse2.setWrapStyleWord(true);
		
		JScrollPane scrollPane2 = new JScrollPane(textResponse2);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_2.add(scrollPane2);
		
		
		
		
		//Create JPanel
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
		//Flow layout - items retain their size, are laid out horizontally and wrap
		panel_service_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		/*
		//Create new label and add it to the panel
		JLabel lblNewLabel_5 = new JLabel(" Name 5 ");
		panel_service_3.add(lblNewLabel_5);
		
		//Input textbox
		textName5 = new JTextField();
		// add it to the panel
		panel_service_3.add(textName5);
		//How wide should input box be? - doesn't effect number that can be entered
		textName5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel(" Name 6 ");
		panel_service_3.add(lblNewLabel_6);
		
		textName6 = new JTextField();
		panel_service_3.add(textName6);
		textName6.setColumns(10);
		*/
		JLabel lblNewLabel_8 = new JLabel(" User ID ");
		panel_service_3.add(lblNewLabel_8);
		textName8 = new JTextField();
		panel_service_3.add(textName8);
		textName8.setColumns(10);
		
		String[] ops3 = new String[] {"Vaccination History", "Available Dates"};
		//Create combobox and add to panel
		JComboBox comboOperation3 = new JComboBox();
		comboOperation3.setModel(new DefaultComboBoxModel(ops3));
		panel_service_3.add(comboOperation3);
	
		//Set Up Button ....
		JButton btnSend3 = new JButton("Check");
		
		//Add an action listener to our button
		btnSend3.addActionListener(new ActionListener() {
			
			//implement action performed method
			//This will happen when the button is clicked
			public void actionPerformed(ActionEvent e) {
				
				ServiceInfo serviceInfo;
				String service_type = "_grpc._tcp.local.";
				//Now retrieve the service info - all we are supplying is the service type
				serviceInfo = simpleJMDNS.SimpleServiceDiscovery.run(service_type);
				//Use the serviceInfo to retrieve the port
				//int port = serviceInfo.getPort();
				String host = "localhost";
				int port = 50053;
				
				ManagedChannel channel = ManagedChannelBuilder
						.forAddress(host, port)
						.usePlaintext()
						.build();
				
				VCblockingStub = VaccinationGrpc.newBlockingStub(channel);
				
				int index = comboOperation3.getSelectedIndex();
				//System.out.print(index);
				if(index==0) {
					
					int name1 = Integer.parseInt(textName8.getText());
					
					
					package3.userId request = package3.userId.newBuilder().setId(name1).build();
	
					package3.hadVaccination response = VCblockingStub.vaccinationHistory(request);
					
					textResponse3.append("reply: \n"+ response.getVaccination() + "\n");

				}
				
				if(index==1) {
					
					package3.request request = package3.request.newBuilder().build();
					
					package3.availableDate response = VCblockingStub.seeAvailableDates(request);
					
					textResponse3.append("reply: \n"+ response.getAvailable() + "\n");
					
				}			
				
			}
		});
		
		panel_service_3.add(btnSend3);
		
		
		textResponse3 = new JTextArea(3, 20);
		textResponse3 .setLineWrap(true);
		textResponse3.setWrapStyleWord(true);
		
		JScrollPane scrollPane3 = new JScrollPane(textResponse3);
		
		//textResponse3.setSize(new Dimension(15, 30));
		panel_service_3.add(scrollPane3);
		
	}

}

public class TestTelevisionCommandDemo {

	public static void main(String[] args) {
		
		Device miTv = new MITV();
		
		On startCommand = new On(miTv);
		RemoteSystem remoteCall = new RemoteSystem(startCommand);
		remoteCall.press();
		VolumeUp miVolUp = new VolumeUp(miTv);
		RemoteSystem volRemoteCall = new RemoteSystem(miVolUp);
		volRemoteCall.press();
		
		
		System.out.println("\n");
		
		Device realMeTv = new RealMeTV();
		
		Off stopCommand = new Off(realMeTv);
		RemoteSystem remoteStopButton = new RemoteSystem(stopCommand);
		remoteStopButton.press();
		VolumeDown realMeVolDown = new VolumeDown(realMeTv);
		RemoteSystem realMeVolRemoteCall = new RemoteSystem(realMeVolDown);
		realMeVolRemoteCall.press();
 
		System.out.println("\n");
		
		 Device samsungTv = new SamsungTV();
			
			On startCommandNew = new On(samsungTv);
			
			RemoteSystem remoteButton = new RemoteSystem(startCommandNew);
			
			remoteButton.press();  
		 

	}

}

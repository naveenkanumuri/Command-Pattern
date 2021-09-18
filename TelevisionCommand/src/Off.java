
public class Off implements Command{
	
	private Device device;

	public Off(Device device) {
		this. device = device;
	}

	@Override
	public void execute() {
	 
		device.off();
		
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}

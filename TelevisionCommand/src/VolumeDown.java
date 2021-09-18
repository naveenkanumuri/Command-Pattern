
public class VolumeDown implements Command {
	
	private Device device;

	public VolumeDown(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volDown(); 
		
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}

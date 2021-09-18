
public class VolumeUp implements Command{
	
	private Device device;

	public VolumeUp(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volUp();
		
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}

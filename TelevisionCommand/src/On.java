
public class On implements Command{
	
	private Device device;

	public On(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.on();
		
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}


public class SamsungTV implements Device {

	@Override
	public void on() {
		System.out.println("SamsungTV is on");
	}

	@Override
	public void off() {
		System.out.println("SamsungTV is off");
		
	}

	@Override
	public void volUp() {
		System.out.println("volume increased");
		
	}

	@Override
	public void volDown() {
		System.out.println("volume decreased");
		
	}

}

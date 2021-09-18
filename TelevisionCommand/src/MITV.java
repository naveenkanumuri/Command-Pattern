
public class MITV implements Device {

	@Override
	public void on() {
		System.out.println("MITV is on");
	}

	@Override
	public void off() {
		System.out.println("MITV is off");
		
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

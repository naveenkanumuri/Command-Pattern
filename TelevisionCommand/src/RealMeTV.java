
public class RealMeTV implements Device{

	@Override
	public void on() {
		System.out.println("RealMeTV is on");
	}

	@Override
	public void off() {
		System.out.println("RealMeTV is off");
		
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

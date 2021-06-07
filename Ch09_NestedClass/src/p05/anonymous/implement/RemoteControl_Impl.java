package p05.anonymous.implement;

public class RemoteControl_Impl implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Audio 켜기");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("Audio 끄기");
	}

}

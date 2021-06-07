package p01_basic;
public class RemotControl_Impl implements RemoteControl {
	//추상 메소드 반드시 재정의
	@Override
	public void turnOn() {
		System.out.println("Overriding turnOn()");

	}

	@Override
	public void turnOff() {
		System.out.println("Overriding turnOff()");

	}
	
	void print() {
		System.out.println("일반메소드 : print()" );
	}
	
	//default method 재정의
	@Override
	public void setMute(boolean mute) {
		System.out.println("Overriding method");
	}

}

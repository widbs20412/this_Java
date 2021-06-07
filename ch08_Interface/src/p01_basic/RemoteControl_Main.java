package p01_basic;

public class RemoteControl_Main {

	public static void main(String[] args) {
		RemotControl_Impl ri = new RemotControl_Impl();
		ri.turnOn();
		ri.turnOff();
		ri.setMute(false);
		RemoteControl.changeBattery();

		// polyMorphism1
		RemoteControl rc = new RemotControl_Impl();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		((RemotControl_Impl) rc).print();
		RemoteControl.changeBattery();

		// polyMorphism2
		RemoteControl rc2 = new RemotControl_Impl();
		RemotControl_Impl rci = (RemotControl_Impl) rc2;
		rci.turnOn();
		rci.turnOff();
		rci.setMute(false);
		rci.print();
		RemoteControl.changeBattery();

		// Anonymous 구현 객체 p.354
		RemoteControl rc3 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			//사용불가
			void print() {
				System.out.println("일반메소드 : Anonymous print()" );
			}
		};
		rc3.turnOn();
		rc3.turnOff();
		rc3.setMute(false);
		//rc3.print();
		RemoteControl.changeBattery();

	}

}

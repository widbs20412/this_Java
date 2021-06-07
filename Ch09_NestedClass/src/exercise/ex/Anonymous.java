package exercise.ex;

public class Anonymous {

	//익명구현객체
	Vehicle v =new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			
		}
	};
	
	void method1() {
		//Local Inner Class : 익명구현객체
		Vehicle v =new Vehicle() {		
			@Override
			public void run() {
				System.out.println("자동차가 달립니다.");			
			}
		};
		v.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
	

}

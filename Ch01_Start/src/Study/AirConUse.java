package Study;

//객체의 변수와 메소드 사용 테스트
public class AirConUse {

	public static void main(String[] args) {
		//객체생성
		AirCon aircon = new AirCon();
		
		//변수 사용
		aircon.color ="White";
		aircon.temp = 10;
		aircon.price = 10000;

		//메소드 사용
		aircon.tempUp();
		System.out.println("ac.temp = " + aircon.temp +", ac.color ="
		+ aircon.color + ",ac.price = " + aircon.price + "원 ");
		aircon.powerOn();
		aircon.powerOff();
		aircon.tempDown();
		System.out.println("ac.temp = " + aircon.temp +", ac.color ="
				+ aircon.color + ",ac.price = " + aircon.price + "원 ");

	}

}

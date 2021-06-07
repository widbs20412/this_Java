package p07_constructor;

public class MotorMain {

	public static void main(String[] args) {
		
		Motor m1  = new Motor();//기본 생성자 호출
		m1.color = "blue";
		System.out.println(m1.color);
		
		Motor m2 = new Motor("blue");
		System.out.println(m2.color);
		
		Motor m3 = new Motor("blue","자동");
		System.out.println(m3.color);
		System.out.println(m3.geaType);
		
		Motor m4 = new Motor("blue","자동",4);
		System.out.println(m4.color);
		System.out.println(m4.geaType);
		System.out.println(m3.door);
	}

}

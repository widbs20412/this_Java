package study07_interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		SeperateVolume obj1 = new SeperateVolume("86738개", "개미","베르베르");
		
		obj1.checkOut("홍길여", "20180611");
		obj1.checkIn();
		
		AppCDinfo obj2 = new AppCDinfo("2018-9001","Spring");
		obj2.checkOut("박삼수", "20180319");
		obj2.checkIn();

	}

}

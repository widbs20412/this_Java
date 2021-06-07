package p01_start;

//메인메소드가 없음 : 실행 불가, 그러나 다른 클래스가 호출하면 사용가능
public class kind {
	
	String name ="홍길동";
	
	
	void abc() {
		System.out.println(name);
		System.out.println(age);
	}
	static void abc2() {
		kind k = new kind();
		System.out.println(k.name);
		k.abc();
	}
	static int age = 20;
}

package p01_basic;
//일반클래스 : 변수, 메소드, 생성자
//추상클래스 : 변수, 메소드, 생성자 + 추상메소드-"미완성 설계도" , 반드시 "abstract"
//인터페이스 : 일반(변수,메소드)제한, 추상메소드 -"밑그림만 그려져 있는 기본설계도"
//			객체 생성 불가 => 구현된 클래스를 만들어서 사용
//			다중 상속(인터페이스간에 상속), 강제성,일관성
//			옵션 "abstract"
//Java7버전까지 : 상수,추상메소드만 사용
//Java8버전까지 : 상수,추상메소드,default(),static()사용
public interface RemoteControl {

	//1.상수(static final 생략 가능)
	static final int max_volue = 10;
				 int min_voiue = 0;
	
	//2.추상메소드 :abstract 생략 가능
	abstract void turnOn();
			 void turnOff();
	//3.default Method() : "default" 사용	
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리");
		else
			System.out.println("무음해제");
	}
	
	//4.static Method()
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

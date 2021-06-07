package p01_start;

public class Start2 {
	//System.out.println(a); :반드시 메소드안에서 사용
	short b =20;
	//메인메소드 ::프로그램의 시작
	public static void main(String[] args) {
		
		int a =10;
		System.out.println(a);
		
		Start2 str2 =new Start2(); //주소값 : str2,참조형
		int s = str2.b;
		System.out.println(s);
		str2.add();
		str2.add2();
		//System.out.println(str2.add());
		System.out.println(str2.add3());
		
		str2.add();//클래스가 다른 경우 반드시 "클래스명.메소드"형태
		str2.add2();//같은 클래스안에 있는 static메소드 인 경우 사용: 클래스명 생략
		str2.add3();
		
		char[] c = {'a','b','c'};
		String s1 = String.copyValueOf(c); //char[] => String
		System.out.println("s1 :: " + s1);
	}
	void add() {
		//System.out.println(5+4);
	}
	void add2() {
		System.out.println(4);
	}
	boolean add3() {
		//System.out.println(4);
		return false;
	}

}

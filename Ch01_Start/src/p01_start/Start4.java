package p01_start;
//CPU - RAM - SSD

//Class : 틀 - 변수, method, 생성자(객체생성시), 초기화블럭(인스턴스,static)
public class Start4 {
	
	//main(): 프로그램 시작 
	public static void main(String[] args) {
		System.out.println("2.main");
		
		Start4 s = new Start4();
		System.out.println(s.a);
		System.out.println(Start4.b);
		s.mul();
		Start4.mul2(); //or mul2();
		
	}
	
	//1변수 
	int a = 10; //SSD -> RAM: 객체생성 
	static double b = 20; //RAM
	//2메소드 
	void mul() {
		System.out.println("mul");
	}
	static void mul2() {
		System.out.println("mul2");
	}
	
	//static초기화블럭(메인시작 시) -> 인스턴스초기화블럭(객체 생성 시) -> 기본생성자 순(객체 생성 시)으로 실행 
	
	//3생성자: 객체 생성시 초기값 저장 
	public Start4() {
		System.out.println("4.기본생성자");
	}
	//4초기화블럭: 실행시 가장 먼저 실행 
	{
		System.out.println("3.인스턴스초기화블럭");
	}
	static{
		System.out.println("1.static초기화블럭");
	}

}

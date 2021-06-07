package p07_constructor;

public class Motor {
	String color, geaType;
	int door;
//생성자 : 클래스이름 사용,return없음,객체 생성시 초기값 저장	
//최초의 기본생성자 : 컴파일러에 의해서 만들어짐, 
//그러나 파라미터가 있는 생성자가 만들어지면 기본생성자 개발자가 만들어야함

	// constructor overloading: 파라미터의 갯수,순서,타입 각각 다른 생성자 모임
	// 기본 생성자
	public Motor() {

	}

	// 파라미터 생성자
	public Motor(String color) {

		this.color = color;
	}
	// 위와 같은 타입(String)이므로 에러 발생
//	public Motor(String color) {

//		this.color = color;
//	}
	public Motor(int d) {

		this.door = d;
	}

	public Motor(String c, String geaType) {
		this(c);// 현재 다른 생성자 호출, 생성자 호출은 반드시 첫 줄에 작성
		// this.color = color;
		this.geaType = geaType;
	}

	public Motor(String color, String geaType, int door) {
		this(color, geaType);// 현재 다른 생성자 호출
		// this.color = color;
		// this.geaType = geaType;
		this.door = door;
	}

	// 일반 메소드 :반환형 타입, return존재
	public int motor() {
		return 10;
	}

}
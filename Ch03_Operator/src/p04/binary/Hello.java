package p04.binary;

public class Hello {

	String name;
	
	//1.Constructor Overloading
	//기본생성자
	public Hello() {
		
	}

	//파라미터가 있는 생성자
	public Hello(String name) {
		super();
		this.name = name;
	}
	//2.@Override : 재정의하다라는 의미
	@Override
	public String toString() {
	
		return name;
	}
}

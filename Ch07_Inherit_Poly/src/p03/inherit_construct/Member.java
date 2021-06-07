package p03.inherit_construct;
//this:현재 클래스

//this(): 현재 클래스의 기본생성자 호출
//super:부모클래스
//super():부모의 기본 생성자 호출

public class Member {
	int age = 30;
	String name;

	public Member() {

	}

	public Member(String name) {
		super();
		this.name = name;
	}

//	public Member(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
//	
//	public Member(String name,int age) {
//		super();
//		this.age = age;
//		this.name = name;
//	}

	void mem() {
		System.out.println(age);
		System.out.println(name);
	}

}

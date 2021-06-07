package p03.inherit_construct;

public class Member_Main extends Member {

	int age = 20;

	public Member_Main(String name) {
		//this.name = name;
		super(name);
	}

	public Member_Main() {
		
	}

	void getInfo() {
		System.out.println("부모의 age : " + super.age);
		System.out.println("자식의 age : " + this.age);
	}
	public static void main(String[] args) {
		Member_Main m = new Member_Main();
		m.getInfo();
		
		Member_Main m2 = new Member_Main("홍길동");
		m2.getInfo();
	}

}

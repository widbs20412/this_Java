package p06_array;

public class Person {
	int age;// 30 31 32 ..

	String name;// 홍길동0 홍길동1 홍길동2..

	public Person(int age, String name) {
		super();//부모의 기본 생성자
		this.age = age;
		this.name = name;
	}

	public Person() {
		
	}
	@Override
	public String toString() {

		return age + " : " + name;
	}
}

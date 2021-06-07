package p01_basic;

//class : 틀(자동차 설계도)
//class : 만들어진 결과를 객체라 한다
//만들어진 하나하나: 인스턴스
public class Student {
	
	//field : 속성,변수
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//method: 동작,기능
	int add(int a, int b) {
		int result = a+b;
		return result;
	}

}

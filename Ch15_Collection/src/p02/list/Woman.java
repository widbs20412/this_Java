package p02.list;

public class Woman {
	String name; //알파고 ,베타고
	int age;//20,30
	
	public Woman(String name, int age) {
		this.name = name;
		this.age = age;
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
 @Override
public String toString() {
	return name +" : "+ age;
}
	
	
}

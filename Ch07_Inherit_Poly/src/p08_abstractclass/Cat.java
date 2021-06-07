package p08_abstractclass;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포우류";
	}
	@Override
	public void sound() {
		System.out.println("냐옹");

	}

}

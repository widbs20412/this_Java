package p08_abstractclass;

public class Dog extends Animal {

	public Dog() {
		this.kind = "포우류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}

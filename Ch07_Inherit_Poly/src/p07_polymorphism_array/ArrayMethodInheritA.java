package p07_polymorphism_array;

public class ArrayMethodInheritA extends ArrayMethod {

	@Override
	public void sleep() {
		System.out.println("Overridng sleep()");
	}

	@Override
	public void showSleepStyle() {
		System.out.println("A Overridng showSleepStyle()");
	}
}

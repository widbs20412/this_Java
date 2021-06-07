package p01_basic;

public class DemoImpl implements ADemo, BDemo {

	@Override
	public void print() {
		System.out.println("Overriding print()");

	}

	@Override
	public void write() {
		System.out.println("Overridng write()");

	}

}

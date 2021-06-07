package p11_final;

public class BB extends B {
	void write() {
		System.out.println("child BB");

	}
	@Override //재정의
	public void print() {
		System.out.println("BB Overriding method");
	}
}

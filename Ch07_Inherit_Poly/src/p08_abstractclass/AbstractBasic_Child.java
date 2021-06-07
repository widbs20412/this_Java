package p08_abstractclass;

public class AbstractBasic_Child extends AbstractBasic {

	@Override
	public void methodB() {
		System.out.println("추상 메소드 재정의 :methodB");

	}
	
	public void print() {
		System.out.println(num);
	}

}

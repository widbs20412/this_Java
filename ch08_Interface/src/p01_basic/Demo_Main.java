package p01_basic;

public class Demo_Main {

	public static void main(String[] args) {
		//1.기존생성방식
		DemoImpl di = new DemoImpl();
		di.write();
		di.print();
		
		//PolyMorphism
		ADemo a1 = new DemoImpl();
		a1.write();
		((DemoImpl) a1).print();
		BDemo b1 = new DemoImpl();
		b1.print();
		((DemoImpl) b1).write();
		
		//익명구현객체
		
		ADemo ad3 = new ADemo() {
			
			@Override
			public void write() {
				System.out.println("Annoymous write()");
				
			}
			//사용불가
			public void print() {
				System.out.println("Annoymous print()");
			}
		};
		ad3.write();
		//((DemoImpl) ad3).print(); 사용불가
		
		

	}

}

package p03.functional_inteface;

public class MyInterface_Main {

	public static void main(String[] args) {//3*4
		//1. 구현객체
		MyInterface_Impl mi = new MyInterface_Impl();
		mi.calculate(3, 4);
		
		//2.익명구현 객체
		MyInterface mi2 = new MyInterface() {
			
			@Override
			public void calculate(int x, int y) {
				int result = x*y;
				System.out.println(result);	
			}
		};
		mi2.calculate(3, 4);
		
		//3.Lambda Expression
        MyInterface mi3 = (x, y) -> {
				int result = x*y;
				System.out.println(result);	
		};
		mi3.calculate(3, 4);
		
		//4.Lambda Expression: return 표현
		MyInterface2 mif = (x, y) -> {
				return x*y;
		};
		mif.calculate(5, 6);
		
	}

}

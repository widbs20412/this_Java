package p10_static;

public class Accumulator_Main {

	public static void main(String[] args) {
		//객체 2개 생성해서 , 첫번째 객체에 10, 두번째 객체에 20
		//total,grandTotal 출력
		
		Accumulator a1 = new Accumulator();
		a1.accumulate(10);
		
		System.out.println("a1.total : " +a1.total);
		System.out.println("Accumulator.grandTotal : " + Accumulator.grandTotal);
		
		Accumulator a2 = new Accumulator();
		a2.accumulate(20);
		System.out.println("a2.total : "+a2.total);
		System.out.println("Accumulator.grandTotal : " + Accumulator.grandTotal);
		
		
		
		
		
		
		

	}

}

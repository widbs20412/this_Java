package p01_start;

public class Start4_main {

	public static void main(String[] args) {
		Start4.main(args);
		
		Start4 s = new Start4();
		System.out.println(s.a);
		System.out.println(Start4.b);
		s.mul();
		Start4.mul2(); //or mul2();
		
		Start4_main s4 = new Start4_main();
		double result = s4.add(10.0,20);
		System.out.println(result);
		
	}
	double add(double a,int b) {//10 20
		double result = a+b;
		return result;
		
	}

}

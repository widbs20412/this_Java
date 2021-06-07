package Study02;

public class OperationTest1 {

	public static void main(String[] args) {
		
		int result=0;
		//main()에서 입력 받아서 처리하기
		
//		int var_int1 = 10;
//		int var_int2 = 2;
		
		int var_int1 = Integer.parseInt(args[0]);
		int var_int2 = Integer.parseInt(args[1]);

		 
		
		System.out.println("var_int1 + var_int2 = " + (var_int1 + var_int2));
		System.out.println("var_int1 - var_int2 = " + (var_int1 - var_int2));
		System.out.println("var_int1 * var_int2 = " + (var_int1 * var_int2));
		System.out.println("var_int1 / var_int2 = " + (var_int1 / var_int2));
		System.out.println("var_int1 % var_int2 = " + (var_int1 % var_int2));


	}

}

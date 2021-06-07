package Study02;

/**
 * 복합 연산자 테스트
 */

public class OperationTest8 {

	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("x += 5 = " + (x += 5));
		System.out.println("x += 3.1 = " + (x += 3.1));
		System.out.println("x *= 2 = " + (x *= 2));
		System.out.println("x /= 2 = " + (x /= 2));
		System.out.println("x -= 5 = " + (x -= 5));
		System.out.println("x %= 2 = " + (x %= 2));

	}

}

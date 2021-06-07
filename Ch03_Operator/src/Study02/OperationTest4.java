package Study02;

/**
 * 논리 연산자 테스트
 */

public class OperationTest4 {
	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		boolean result = false;

		System.out.println("x" + "<" + "y" + "&&" + "y" + ">=" + (200) + "=" + (x < y && y >= 200));
		System.out.println("x" + "<" + "y" + "&&" + "y" + "<" + (200) + "=" + (x < y && y < 200));
		System.out.println("x" + ">" + "y" + "&&" + "y++" + ">" + (200) + "=" + (x < y && y++ > 200));
		System.out.println("y= " + y);
		System.out.println("x" + "<" + "y" + "||" + "y" + ">=" + (200) + "=" + (x < y || y >= 200));
		System.out.println("x" + "<" + "y" + "||" + "y" + "<" + (200) + "=" + (x < y || y < 200));
		System.out.println("x" + ">" + "y" + "||" + "y++" + ">=" + (200) + "=" + (x < y || y++ > 200));
		System.out.println("y= " + y);
		System.out.println("x" + "<" + "y" + "||" + "y++" + ">" + (200) + "=" + (x < y || y++ > 200));
		System.out.println("y= " + y);
		System.out.println("!" + "(x" + ">" + "y)" + "=" + !(x > y));

	}
}

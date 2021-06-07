package p05_string;

import p01_reference.Point;

public class StringEqualsEx {

	public static void main(String[] args) {
		// 1.제조사가 만든 클래스 : 재정의 불필요 - 이미 프로그래밍 되어 있음
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		System.out.println(str1.toString());
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		// 2.우리가 만든 클래스 : toString()재정의
		Point p1 = new Point(100, 300);
		Point p2 = new Point(100, 300);
		System.out.println(p1.toString());
		System.out.println(p2);

		// "==" : 수치비교 사용
		if (str1 == str2)
			System.out.println("str1 == str2 참조가 같음");
		else
			System.out.println("str1 == str2 참조가 같지 않음");
		if (str3 == str4)
			System.out.println("str3 == str4 참조가 같음");
		else
			System.out.println("str3 == str4 참조가 같지 않음");

		// equals():문자열비교,객체비교
		if (str1.equals(str2))
			System.out.println("str1 == str2 참조가 같음");
		else
			System.out.println("str1 == str2 참조가 같지 않음");

		if (str3.equals(str4))
			System.out.println("str3 == str4 참조가 같음");
		else
			System.out.println("str3 == str4 참조가 같지 않음");

	}

}

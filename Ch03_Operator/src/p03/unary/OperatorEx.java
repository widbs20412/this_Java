package p03.unary;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		//문자를 키보드 입력받아서 받은 문자가 숫자이면 "입력하신 문자가 숫자입니다." 출력하기
		//영문자(a~z,A~Z)이면 "입력하신 문자는 영문자입니다." 출력하기
		Scanner sc =new Scanner(System.in);
		System.out.println("문자를 입력하세요:");
		String input = sc.next();
		char c = input.charAt(0);
		
		char c2 ='0';
		int i2 = c2;
		System.out.println("0 :"+i2);
		char c3 ='9';
		int i3 = c3;
		System.out.println("9 :"+i3);
		
		if('0' <= c && c <='9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		if(('a' <= c && c <='z') || ('A' <= c && c <='Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}

}

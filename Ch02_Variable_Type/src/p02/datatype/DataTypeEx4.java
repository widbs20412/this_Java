package p02.datatype;

import java.util.Scanner;

public class DataTypeEx4 {

	public static void main(String[] args) {
		int intvalue = 103029770;
		byte byteValue = (byte) intvalue;
		System.out.println(byteValue);
		
		intvalue = 10;
		byteValue = (byte) intvalue;
		System.out.println(byteValue);
		
		//키보드 입력받는 Scanner Class
		//System.in : 키보드 입력
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("문자열 저장하지 않고 곧바로 출력 : " + sc.next()); //입력
		
		//상수 : 프로그램 끝날 때 까지 초기값(처음에 입력된)유지
		System.out.println("byte 고정상수 :"+ Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		if(i < Byte.MIN_VALUE || i> Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없습니다. 형변환불가");
		}else {
			System.out.println("형변환가능");
			byte b = (byte) i; //형변환
			System.out.println(b);
			
		}
		//if(i<Byte.MIN_VALUE);
	}

}

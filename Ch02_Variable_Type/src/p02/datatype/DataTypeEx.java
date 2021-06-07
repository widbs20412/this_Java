package p02.datatype;

import p01.variable.VariableEx;

public class DataTypeEx {

	public static void main(String[] args) {
		//1.primitive type()
		byte  by = 127;//-128~127 1byte 크기
		char ch = 'a';//문자1개 저장 , 2byte
		short sh = 32767;//-32768~32767,2byte
		int in = 2100000000;//-21억~21억,4byte
		long lo =2100000000000000000L; //가장 큰 타입,8byte
		
		boolean bo= true;
		
		//소숫점에서 default : double
		double d =10.7;
		float f =9.1f;
		
		System.out.println(by);
		System.out.println(ch);
		System.out.println(bo);
		System.out.println(f);
		
		//2.Reference Type(참조형)
		VariableEx ve = new VariableEx();
		System.out.println(ve);
		
		String s = new String();
		System.out.println("s :"+s);
		
		String s2 = new String("홍길동");
		System.out.println(s2);
		
		

	}

}

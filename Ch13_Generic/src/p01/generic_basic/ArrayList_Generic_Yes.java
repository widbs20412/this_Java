package p01.generic_basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Generic_Yes {

	public static void main(String[] args) {
		// 1.Generic Yes : 타입별로 저장,강제형변환(Casting) 불필요, 컴파일시 강한 타입체크
		// ArrayList : 동적배열크기, 자료가 순차적이고 중복적
		ArrayList a1 = new ArrayList();

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add(new String("홍길동"));
		a2.add("홍길동2");
		a2.add(new String("홍길동3"));

		for (int i = 0; i < a2.size(); i++)
			System.out.println(a2.get(i));


		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(10);
		a3.add(new Integer(10));

		for (Integer s : a3)
			System.out.println(s);

		ArrayList<Phone> a4 = new ArrayList<Phone>();
		a4.add(new Phone());
		a4.add(new Phone("Original"));

		for (Phone s : a4)
			System.out.println(s);

	}
}

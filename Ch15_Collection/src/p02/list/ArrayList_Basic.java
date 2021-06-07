package p02.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//List 계열 : 자료가 순차적이고, 중복적인 자료가 있을 때 사용
// 			ArrayList, Vector, LinkedList
//Vector : Synchronized 메소드 적용, 속도 늦음, 초기에 나옴
//ArrayList: 비동기화 메소드 적용, 속도가 빠름,배열의 단점을 극복(배열의 가변),수정사항 가능

public class ArrayList_Basic {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("홍길동");
		ar.add(10);
		ar.add(true);
		ar.add(12.5);
		ar.add('A');
		ar.add('A');
		System.out.println(ar);

		// Generic
		ArrayList<Object> ar2 = new ArrayList();
		ar2.add("홍길동");
		ar2.add(10);
		ar2.add(true);
		ar2.add(12.5);
		ar2.add('A');
		ar2.add('A');
		System.out.println(ar2);

		// Generic - Casting(강제형변환 불필요)
		ArrayList<String> ar3 = new ArrayList();
		ar3.add("홍길동");
		ar3.add("홍길동");
		System.out.println(ar3);

		// 일반 for
		for (int i = 0; i < ar3.size(); i++)
			// System.out.println(ar3[i]); 배열인경우
			System.out.println(ar3.get(i));

		// 향상된 for
		for (String s : ar3)
			System.out.println(s);

//		Collections.sort(ar3);//재정의.....
//		System.out.println(ar3.sort(null));
		
		
		List<Man> am = new ArrayList<Man>();
//		ArrayList<Man> am = new ArrayList<Man>();
		am.add(new Man("홍길동", 10));
		am.add(new Man("알파고", 20));

		// 1. 일반
		for (int i = 0; i < am.size(); i++) {
			Man m  = am.get(i);
			System.out.println(am.get(i).name);
			String name = m.getName();
			int age = m.getAge();
			System.out.println(name + " : " + age);
		}
			

		// 2.향상된 for
		for (Man m : am) {
			String name = m.getName();
			int age = m.getAge();
			System.out.println(name + " : " + age);
		}
		// 3.interator
		Iterator<Man> it = am.iterator();
		while (it.hasNext()) {
			Man m = it.next();
			String name = m.getName();
			int age = m.getAge();
			System.out.println(name + " : " + age);
		}
		

	}


}

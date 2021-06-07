package p05.search;

import java.util.NavigableSet;
import java.util.TreeSet;

//Search : TreeSet-Tree 구조에 저장, 자동으로 정렬, 부모값과 비교해서 작으면 왼쪽, 크면 오른쪽 
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };
		Integer it = null;

		// 방법1
		t.add(new Integer(80));

		// 방법2
		for (int i = 0; i < score.length; i++)
			t.add(new Integer(score[i]));

		System.out.println(t);
		System.out.println("가장 낮은 점수: " + t.first());
		System.out.println("가장 높은 점수: " + t.last());
		System.out.println("65 아래 점수:" + t.lower(65));
		System.out.println("65이거나 바로 아래 점수 : " + t.floor(64));
//		while(!t.isEmpty()){//isEmpty가 아마 빈공간? 있는지 확인인가
//			it = t.pollFirst();//
//			System.out.println(it+"(남은 객체수 : "+t.size()+")");
//		}

		// 내림차순 정렬
		// navigableSet<E> descendingSet()

		NavigableSet<Integer> ns = t.descendingSet();
		for (Integer s : ns)
			System.out.print(s + " ");
		System.out.println();
		// 오름차순 정렬
		NavigableSet<Integer> ns2 = ns.descendingSet();
		for (Integer s2 : ns2)
			System.out.print(s2 + " ");

//향상된 for
//		for(Integer s : score)
//			System.out.print(s + " ");

	}

}

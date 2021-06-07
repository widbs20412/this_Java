package p02.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysASListExample {

	public static void main(String[] args) {
//		ArrayList list1 = Arrays.asList("홍길동1","홍길동2","홍길동3");
		List<String> list1 = Arrays.asList("홍길동1", "홍길동2", "홍길동3");
		List<String> list2 = new ArrayList(Arrays.asList("홍길동1", "홍길동2", "홍길동3"));

		for (String s : list1)
			System.out.println(s);
		for (String s : list2)
			System.out.println(s);

		List<Integer> list3 = Arrays.asList(1, 2, 3);
		
		for (Integer a : list3)			
			System.out.println(a);
		
		for (int a : list3)			
			System.out.println(a);
	}
}

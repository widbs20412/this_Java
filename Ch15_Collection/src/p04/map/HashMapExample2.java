package p04.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		Map<Student, Integer> map2 = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"),new Integer(95));
		map.put(new Student(1, "홍길동"),95);
		map.put(new Student(1, "홍길동"),55);
		//key : 중복 불가
		System.out.println("총 Entry수 : "+map.size());//1
		
		//value값 출력하기
		Integer num = map.get(new Student(1, "홍길동"));
		System.out.println(num);
	}

}

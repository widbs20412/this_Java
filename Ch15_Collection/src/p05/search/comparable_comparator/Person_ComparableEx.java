package p05.search.comparable_comparator;
//Compare(오름,내림차순) Comparable : 우리가 만든 클래스에 대한 객체 비교시 Comparable를 재정의 해서 사용해야 비교 가능
//           					 : 일반적인 정렬 시 사용
//					  comparator : 특수한 정렬을 요할 때 사용
import java.util.Iterator;
import java.util.TreeSet;

public class Person_ComparableEx {

	public static void main(String[] args) {
		TreeSet<Person> ts;
		try {
			ts = new TreeSet<>();
			ts.add(new Person("apple", 5));
			ts.add(new Person("orange", 50));
			ts.add(new Person("grape", 25));
			System.out.println(ts);
			
			Iterator<Person> it = ts.iterator();
			while(it.hasNext()) {
				  Person person = it.next();
		            System.out.println(person.name + ":" + person.age);
			}
		}catch (ClassCastException e) {
			System.out.println("우리가 만든 클래스는 비교시 재정의 해야 한다. Person클래스에서 작성");
			e.printStackTrace();
		}catch (Exception e) {
			
		}
		System.out.println("종료");
	}

}

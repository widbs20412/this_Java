package p05.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {

	static Student s1 = new Student("홍길동", 90, 96);
	static Student s2 = new Student("알파고", 95, 93);
	private static List<Student> list = Arrays.asList(s1, s2);

	// Function(T,R) : T:입력객체 R:리턴객체
	public static void printString(Function<Student, String> tf) {
		for (Student sf : list) { // list에 저장된 항목 수만큼 루핑
			System.out.println(tf.apply(sf) + " ");
			System.out.println();
		}
	}

	public static void printInt(ToIntFunction<Student> tf) {
		for (Student sf : list) { // list에 저장된 항목 수만큼 루핑
			System.out.println(tf.applyAsInt(sf) + " ");
			System.out.println();
		}
	}
	
	public static double avg(ToIntFunction<Student> tf) {
		int sum =0;
		for (Student sf : list)  // list에 저장된 항목 수만큼 루핑
			sum += tf.applyAsInt(sf);
			double avg =(double)sum/list.size();
			return avg;
		}

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("run");
		r1.run();

		System.out.println("[학생이름]");
		printString((t) -> t.getName());

		System.out.println("[영어점수]");
		printInt((t) -> t.getEng());
		
		//printInt(ToIntFunction<Student> tf = new ToIntFunction<Student>(){
		//	public int applyAsInt(Student t) {
		//		t.getEng();
		//	};
		//});
		
		System.out.println("[수학점수]");
		printInt((t) -> t.getMat());
		
		System.out.println("[영어점수 평균 : ]");
		double engavg = avg((Student t) ->t.getEng());		
		System.out.println(engavg);
	}
}

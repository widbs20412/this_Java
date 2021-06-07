package Study03;

import java.util.Scanner;

public class Teacher {
	
	
	Scanner sc;
	Student st;
	
	//기본생성자 : 객체 생성시 초기값 저장시 사용
	public Teacher() {
		 sc = new Scanner(System.in);
		 st = new Student();
	}
	//입력
	public void input() {
		System.out.println("학생 이름 입력 ");
		st.name = sc.next();
		System.out.println(st.name + "님의 국어 점수:");
		st.kor = sc.nextInt();
		System.out.println(st.name + "님의 수학 점수:");
		st.math = sc.nextInt();
		System.out.println(st.name + "님의 영어 점수:");
		st.eng = sc.nextInt();
		System.out.println();
		
	}

	//합계
	public void sum() {
		int total = st.kor+st.math+st.eng;
		System.out.println(st.name + "의 총점"+total);	
	}
	
	//평균
	public void avg() {
		int total = st.kor+st.math+st.eng;
		int avg = total/3;
		System.out.println(st.name + "의 평균"+avg);	
	}

}

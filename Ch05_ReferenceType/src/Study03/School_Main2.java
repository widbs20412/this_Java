package Study03;

import java.util.Scanner;

public class School_Main2 {

	public static void main(String[] args) {
		boolean run = true;
		int kor = 0;
		int math = 0;
		int eng = 0;

		String aa = "";
		int total = 0;
		float avg = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------");
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 총점 출력");
			System.out.println("3.학생 평균 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("-----------");

			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("학생 이름 입력");
				aa = sc.next();

				System.out.println(aa + "님의 국어 점수를 입력해주세요 :");
				kor = sc.nextInt();

				System.out.println(aa + "님의 수학 점수를 입력해주세요 :");
				math = sc.nextInt();

				System.out.println(aa + "님의 영어 점수를 입력해주세요 :");
				eng = sc.nextInt();
				break;
			case 2:
				System.out.println("총점");
				total = kor + math + eng;
				System.out.println("총점 : " + total);
				break;
			case 3:
				System.out.println("평균");
				avg = total / 3;
				System.out.printf("평균 : %2f \n", avg);
				break;
			case 4:
				run = false;
				break;

			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	
}

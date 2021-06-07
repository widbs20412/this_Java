package Study02;
import java.util.Scanner;
/**
 * 총점, 평균 구하기 예제
 */
public class OperationTest2 {

	public static void main(String[] args) {
		//1.Scanner 입력 방법
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		int total;
		float avg;

		System.out.println("국어 점수를 입력해주세요 :");
		kor = sc.nextInt();

		System.out.println("수학 점수를 입력해주세요 :");
		math = sc.nextInt();

		System.out.println("영어 점수를 입력해주세요 :");
		eng = sc.nextInt();

		total = kor + math + eng;

		System.out.println("국어 점수 : " + kor);
		System.out.println("수학 점수 : " + math);
		System.out.println("영어 점수 : " + eng);
		System.out.println("총점 : " + total);

		avg = (float) total / 3;
		System.out.printf("평균 : %2f \n", avg);
		sc.close();
		
		//2.main() 통한 입력
		int total2 = 0;
		int avg2 = 0;
		
		int kor2 = Integer.parseInt(args[0]);
		int math2 = Integer.parseInt(args[1]);
		int eng2 = Integer.parseInt(args[2]);
		
		total2 = kor2 + math2 +eng2;
		avg2 = total2/3;
		
		System.out.println("total2 = " + total2);
		System.out.println("avg2 = "+ avg2);
		

	}

}
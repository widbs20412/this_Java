package exercise4;

public class Exercise06 {
	// for문 이용해서 *로 된 삼각형 출력하기
	public static void main(String[] args) {
		int a;
		int b;
		for(a=1; a<=5; a++) {//행
			for(b=1; b<=a; b++) {//열
				System.out.print("*");
			}
			System.out.println();//다음 행
		}

	}

}

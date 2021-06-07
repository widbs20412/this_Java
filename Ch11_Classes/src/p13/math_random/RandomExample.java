package p13.math_random;

import java.util.Arrays;
import java.util.Random;

//p.537
//로또 : 1~45
public class RandomExample {

	public static void main(String[] args) {
		// 선택번호: 숫자6개(23,42,40,1,16,33)
		int selectNumber[] = new int[6];
		Random r = new Random(3L);
		System.out.println("선택번호 : 난수사용");
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = r.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		// 당첨번호
		int winNumber[] = new int[6];
		Random r2 = new Random(3L);
		System.out.println("선택번호 : 난수사용");
		for (int i = 0; i < winNumber.length; i++) {
			winNumber[i] = r2.nextInt(45) + 1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		// 당첨확인
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		boolean result = Arrays.equals(selectNumber, winNumber);
		if (result)
			System.out.println("당첨여부 : 1등에 당첨되었습니다.");
		else
			System.out.println("당첨여부 : 당첨되지 않았습니다.");
	}

}

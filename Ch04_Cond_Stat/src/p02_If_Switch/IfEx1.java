package p02_If_Switch;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {

		int score = 30;
		if (score >= 90) {
			System.out.println("A");
			System.out.println("최고 등급입니다.");
		} else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");

		// Math.random: 난수 얻기(0.0 ~ 0.99999999)
		int num = (int) (Math.random() * 6) + 1;

		System.out.println("--------------------------");
		Scanner sc = new Scanner(System.in);
//		int x=0;
//		int y=0;
//		int z=0;
		System.out.println("x를 입력하시오 :");
		int x = sc.nextInt();
		System.out.println("y를 입력하시오 :");
		int y = sc.nextInt();
		System.out.println("z를 입력하시오 :");
		int z = sc.nextInt();
		
		if (y > x) {
			if(y<z)
				System.out.println("y는 x보다 크고, z보다 작다.");
			else
				System.out.println("x는 y보다 크고, z보다 작다.");
		} else {
			System.out.println("y는 x보다 작다");
			sc.close();
		}

	}

}

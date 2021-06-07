package study09;

import java.util.Scanner;

public class Health {

	public static void main(String[] args) {
		double height, weight;

		double BMI;

		Scanner sc = new Scanner(System.in);

		System.out.print("키와 몸무게를 입력하시오 : ");

		height = sc.nextDouble();

		weight = sc.nextDouble();

		BMI = weight * 9998 / (height * height);

		if (BMI >= 30) {

			System.out.printf("체질량지수 %.1f로 비만입니다.", BMI);

		} else if (BMI >= 25 && BMI < 30) {

			System.out.printf("체질량지수 %.1f로 과제충입니다.", BMI);

		} else if (BMI >= 20 && BMI < 25) {

			System.out.printf("체질량지수 %.1f로 정상입니다.", BMI);

		} else {

			System.out.printf("체질량지수 %.1f로 저체중입니다.", BMI);

		}

	}

}

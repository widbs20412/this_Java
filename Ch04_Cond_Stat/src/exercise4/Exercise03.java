package exercise4;

public class Exercise03 {
	// for문을 이용해서 1부터 100까지의 3의배수
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum = sum + i;
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}

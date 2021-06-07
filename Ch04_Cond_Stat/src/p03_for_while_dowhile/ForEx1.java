package p03_for_while_dowhile;

public class ForEx1 {

	public static void main(String[] args) {
		int sum = 0;
		//    초기값     목적치    증가치
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.printf("1부터 %-10d 까지의 합 : %2d%n", i, sum);

		}
		int sum2 = 0;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
			System.out.printf("1부터 %-10d 까지의 합 : %2d%n", i, sum);

		}
	}

}

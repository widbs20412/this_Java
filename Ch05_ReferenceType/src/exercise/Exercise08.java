package exercise;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] arr = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int[][] arr2 = new int[3][];
		System.out.println(arr.length);// 3 가로행
		System.out.println(arr[0].length);// 2 1행 열 갯수
		System.out.println(arr[1].length);// 3 2행의 열 갯수
		System.out.println(arr[2].length);// 5 3행의 열 갯수

		double sum = 0;
		int count = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				sum = sum + arr[i][j];
				count++;
			}
		avg = sum / count;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}

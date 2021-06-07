package p06_array;

public class Array_Score {

	public static void main(String[] args) {
		// 95,71,84,93,87
		int total = 0;
		int avg = 0;

		int kor = Integer.parseInt(args[0]);
		int math = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int sci = Integer.parseInt(args[3]);
		int soc = Integer.parseInt(args[4]);

		total = kor + math + eng + sci + soc;
		avg = total / 5;

		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
		System.out.println("------------------------");

		int a = 95;
		int b = 85;
		int c = 75;
		int d = 65;
		int e = 55;

		int sum = 0;
		int arr[] = { 95, 85, 75, 65, 55 };
		for (int s : arr)
			sum += s;
		System.out.println("점수 총합: " + sum);
		double avg2 = sum / arr.length;
		System.out.println("점수 평균: " + avg2);

		System.out.println("----메소드 호출을 통한 총점 구하기----");
		Array_Score as = new Array_Score();
		int[] arr2 = { 95, 85, 75, 65, 55 };
		int sum2 = as.add(arr2);
		System.out.println("점수 총합2 : " + sum2);

		System.out.println("----메소드 호출을 통한 평균 구하기----");
		Array_Score as3 = new Array_Score();
		int[] arr3 = { 95, 85, 75, 65, 55 };
		double avg3 = as.avg(arr3);
		System.out.println("점수 평균2 : " + avg3);
	}

	public int add(int[] arr) {
		int sum = 0;
		for (int s : arr)
			sum += s;
		return sum;
	}

	public double avg(int[] arr) {
		double avg3 = add(arr)/arr.length;
		return avg3;
	}

}

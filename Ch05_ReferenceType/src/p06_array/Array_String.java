package p06_array;

public class Array_String {

	public static void main(String[] args) {
		System.out.println("------String 배열 생성------");
		// 배열의 형태
		 String[] arr = {"홍길도","홍길동1","홍길동2"};
		 System.out.println(arr[0]);
		// (1)
		int[] arr1 = { 10, 20, 30 };
		System.out.println("배열의 크기 :" + arr1.length);
		System.out.println("배열의 첫번째 :" + arr1[0]);// index =0,1,,,,

		// (2)
		int arr2[] = new int[3];// 크기(갯수)
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		System.out.println(arr2[1]);
		
		//(3)
		int[] arr3 = new int[] {10,20,30};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		//일반 for문
		for(int i=0; i< arr3.length; i++)
			System.out.println(arr3[i]);
		
		//향상된for문
		for(int i : arr3)
			System.out.println(i);
	}

}

package p06_array;

public class DemensionEx1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0]);
		arr[0] = arr[0] + arr[1];
		System.out.println(arr.length);
		System.out.println("-------------------");
		
		//1차원배열
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("-------------------");
		
		int t[][]=new int[3][4];

		int table[][] = { {1, 2, 3, 4}, 
				        { 5, 6, 7, 8 }, 
				        { 9, 10, 11, 12 } 
				        };
		System.out.println(table[0][0]);
		System.out.println(table[0][0]);
		table[0][0] = table[0][0] + table[0][1];
		System.out.println(table[0][0]);
		System.out.println(table.length);
		
		//2차원배열
		System.out.println("-------------------");
		for(int i=0; i<table.length; i++)
			for(int k=0; k<table[i].length; k++)
			System.out.printf("table[%d][%d] = %d%n",i,k,table[i][k]);
		System.out.println("-------------------");
	}

}

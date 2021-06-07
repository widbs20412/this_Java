package p11.arrays;
//p.521 
import java.util.Arrays;
import java.util.List;

import p03.object.tostring.ToStringEx1;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		System.out.println(arr1);
		System.out.println(arr1[0]);
		
		//일반 for문
		for(int i=0; i<arr1.length; i++)
			System.out.println("일반 for문"+arr1[i]);
		
		//향상된 for문
		for(char c : arr1)
			System.out.println("향상된 for문"+c);
		System.out.println("-----------------");
		
		//toString : char형식을 문자열로 나온다
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//static char[] copyOfRange(char[] original,int from,int to)
		char[] arr3 = Arrays.copyOfRange(arr1,0,4);//-1
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);//어디서 몇번부터 어디에 저장하냐 시작은 어디?
		for(char c : arr4)
			System.out.print(c);
		//방법 5
		//static <T> List<T> asList(T...a)
		List<char[]> list = Arrays.asList(arr1);
		System.out.println(list);
		
		String[] str = {"d","a","b","c"};
		List<String> list2 = Arrays.asList(str);
		System.out.println(list2);
	}

	private static char[] copyOfRange(char[] arr1, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}

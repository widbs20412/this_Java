package p06_array;

public class ArrayCopyForEx1 {

	public static void main(String[] args) {

		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			System.out.println(newIntArray[i] + " ");
		}
		System.out.println("-------------------------");

		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] result = new char[abc.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(result);
		//

	}

}

package p04.binary;

public class BitReverseOperatorEx {

	public static void main(String[] args) {
		BitReverseOperatorEx bo = new BitReverseOperatorEx();
		int v1 = 10;//00000000 00000000 00000000 00001010
		int v2 = ~v1;//~표시는 반대를 의미 즉 NOT이라는 뜻 : 0101
		int v3 = ~v1+1;//NOT :0110
		System.out.println(toBinaryString(v1) + "(십진수 : "+ v1+ ")");
		System.out.println(toBinaryString(v2) + "(십진수 : "+ v2+ ")");
		System.out.println(toBinaryString(v3) + "(십진수 : "+ v3+ ")");
		System.out.println();
		
		int v4 = 10;
		int v5 = ~v4;
		int v6 = ~v4+1;
		System.out.println(toBinaryString(v1) + "(십진수 : "+ v4+ ")");
		System.out.println(toBinaryString(v2) + "(십진수 : "+ v5+ ")");
		System.out.println(toBinaryString(v3) + "(십진수 : "+ v6+ ")");
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}

}

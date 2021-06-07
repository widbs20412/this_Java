package p04.binary;

public class AritemeticOperatorEx {

	public static void main(String[] args) {
		//Operation Operator Opration
		//      a      +       b
		int a = (int) (10+20+30.0);//대입,산술
		String s;
		int i =123;
		s =i+"";//여기서  + ->연결연산자 : 숫자+문자열 =문자열
		//int k = i+""; - 불가능
		System.out.println("문자열 : " +s);//문자열
		int i2 =Integer.parseInt(s);
		System.out.println(i2 + 10);
		System.out.println(i2 + 10 + "abc");//결과 :133abc
		System.out.println("abc"+ i2 + 10);//결과 :abc12310
		
		int z,x,v = 5;
		z = x = v =10;//대입연산자이므로 오른쪽에서 왼쪽으로 진행
		
		double d = 100*2/3%5;

	}

}

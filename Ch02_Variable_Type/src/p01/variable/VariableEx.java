package p01.variable;
//CPU - RAM - SSD

//Variable(변수) :하나의 값을 저장할 수 있는 메모리(RAM)공간
//              선언된 범위 안에서만 사용.
//null : unknown (알 수 없는 어떤 값:0도 아니, 빈문자열도 아님)
//자바는 대소문자를 구분해서 사용하는 언어
public class VariableEx {
	//전역(field)변수 - 초기화 불필요
	//Instance 변수 -객체를 생성해야 사용할 수 있는 변수
	int a; //기본값 저장됨
	boolean b; //false이 들어있음
	float  c;
	
	int result;
	//int while; 예약어는 사용불가
	
	//static(정적변수) - "클래스명.변수" 형태로 사용
	public static void main(String[] args) {
		String str = null;
		
		//primitive type variable :실제값
		int value =1; //반드시 초기화된것!!!
		//reference type variable :주소값
		String s = new String("홍길동");
		VariableEx v = new VariableEx();
		//local variable(지역):
		//메소드 안에서 선언된 변수
		//반드시 초기화-시작할 때 값이 존재해야함
		v.result = value+10;
		
		
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		
		int r2 = v.add(5.0, 4.1f);//Argument(인수)
		System.out.println(r2);
		//double값은 뒤에 d를 붙여도 되고 안붙여도 됩니다. + float값은 무조건 f를 붙여주세요!
		System.out.println(v.r);
		
		str = new String("abcd");
		System.out.println(str.toUpperCase());
	}
	 int r = a + result;
	
	//Parameter 변수 : double a, float b
	//local 변수
	int add(double a , float b) {//5.0 4.1
		double result = a+b;//9.1
		return (int) result;//강제형변환(casting)
	}

}

package p02.datatype;

public class DataTypeEx2 {
	public static void main(String[] args) {
	short sh = 12;//2byte : 32767
	
	//primitive type : int(default) - 사칙연산 등 연산 int타입으로 바뀐 후 연산이 이루어짐
	int n = sh; //promotion(자동 형변환)
	
	char c ='A';//2byte : 0~65535
	System.out.println(c);
	int n2 = c;
	System.out.println(n2);
	n2 = c+1;
	System.out.println(c+1);//66
	System.out.println(n2);//66
	char c2 = (char) (c+1);// casting :강제형변환 , char +1 : int타입으로 연산
	char c3 = c2;
	System.out.println(c3);
	
	char c4 = '\u0041'; //unicode 16진수
	int n3 = c4;//casting :강제형변환
	System.out.println(n3);
	
	//double(8byte=64bit):1bit(부호) + 52bit(가수) + 11bit(지수):
	//예시- 12345.789 = 12345789X10**5
	//double(8byte) : 소숫좀에서 기본형(D,d 붙여도 관계없음
	double d = 23.9;
	
	//float(4byte=32bit):1bit(부호)+23bit(가수)+8bit(지수)
	float f = 12.3f; //Casting(강제형변환 : 8=>4)
	//또는 float f = (float)12.3d;
	
 }
}

package p04.binary;

public class StringCatEx {

	public static void main(String[] args) {
		String str1 = new String("홍길동1");//객체생성
		String str2 = new String("홍길동2");//객체생성
		String str3 = "홍길동3";//생성된 객체가 있으면 연결해서 사용
		
		String str4 = "JDK" + 6.0;//(6.0 앞에 아무것도 없으면)double타입 
				        //"JDK" + "6.0" - 문자열
		System.out.println(str4);
		
		String str5 = "JDK" + 6.0 + 3.0;//"JDK" + "6.0"+"3.0"- 문자열
		System.out.println(str5);
		
		String str6 = 6.0 + 3.0 +"JDK";//9.0 + "JDK" => "9.0" + "JDK"- 문자열
		System.out.println(str5);
	}

}

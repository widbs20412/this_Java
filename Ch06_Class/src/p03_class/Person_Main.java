package p03_class;

public class Person_Main {

	public static void main(String[] args) {
		int num1=2 ,num2 = 2;
		if(num1 == num2) System.out.println("같다");
		//if(num1.equals(num2)) System.out.println("같다");
		//== 숫자비교 .equals 문자열,객체비교할때 사용
		
		String name1 = new String("홍길동1");
		String name2 = new String("홍길동2");
		System.out.println("name1 :" + name1);
		//System.out.println("name1 :" + name1.toString());//홍길동
		if(name1.equals(name2))
			System.out.println("같다");
		
		
		Person p1 = new Person("홍길동p1",20);
		Person p2 = new Person("홍길동p",20);
		
		System.out.println("p1(주소값) :"+ p1);
		System.out.println("p1(생성값) :"+ p1.toString());
		if(p1.equals(p2))
			System.out.println("p1=p2는 같다");
		else
			System.out.println("p1=p2는 같지않다");
	}

}

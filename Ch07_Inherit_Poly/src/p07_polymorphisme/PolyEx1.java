package p07_polymorphisme;
//PolyMorphim(다형성) : 여러개의 개별적인 클래스를 하나의 부모 클래스 객체로 통합관리해서 효율성을 높인것
//부모(큰타입) 자식(작은타입)
//형변환 : 상속관계에서만 사용 가능
public class PolyEx1 {

	public static void main(String[] args) {
		//primitive
		byte a = 10;
		short b =20;
		int c= 330;
		long d = 4000;
		
		//큰타입 = 작은타입
		long e1 = a; //promotion (자동형변환)
		long e2 =b;
		long e3 = c;
		
		//작은타입 = (작은타입)큰타입
		int k =(int)e1; //Casting(강제형변환)
		
		//상속관계가 아니므로 성립 불가
		//Strig str = new Baseball();
		
		//형변환 : 상속관계에서만 사용 가능
		//Reference
		Baseball b1 = new Baseball();
		b1.type();
		b1.write();
		
		//부모 클래스의 눈으로 생성된 자식을 바라보면
		Game b2 = new Baseball();//상속관계에서만 가능
		b2.type();
		((Baseball) b2).write();

	}

}

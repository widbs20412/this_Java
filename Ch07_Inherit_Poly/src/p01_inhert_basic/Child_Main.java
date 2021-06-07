package p01_inhert_basic;
//상속대상 : 변수,메소드
//상속대상에서 제외 : constructor,초기화블럭,private
public class Child_Main {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.pv);
		c1.pMethod();
		System.out.println(c1.cv);
		c1.cMethod();
		
		Parent p = new Parent();
		System.out.println(p.pv);
		p.pMethod();
	}

}

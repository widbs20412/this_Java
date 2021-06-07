package study05;
class Parent{
	public void method() {
		int parentVar = 10;
		System.out.println("parent Method");
		System.out.println("child Method:" + parentVar);
		
	}
}
class Child extends Parent{
	int childVar = 20;
	void Method() {
		System.out.println("child Method");
	}
	
}

public class ExtendsTest {

	public static void main(String[] args) {
		Child c = new Child();
		
		Parent p = c;
		c.method();
		c.Method();
		System.out.println("child Method:" +c.childVar);
		//System.out.println(c.parentVar);
		

	}

}

package p10_static;
//inital Block
public class Product {
	static int count;
	int seriaNo;
	int add;
	{
		System.out.println("2.Instance inital Block : 객체 생성시마다 실행");
		++count;
		seriaNo = count;
	}
	static {
		System.out.println("1.static inital Block : 프로그램 실행시, 최초 한번 생성");
	}
	public Product() {
		System.out.println("3.기본생성자 : 파라미터가 없는 생성자 일때 실행");
	}
}

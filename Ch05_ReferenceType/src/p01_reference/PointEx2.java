package p01_reference;

public class PointEx2 {

	public static void main(String[] args) {
		Point p1 = new Point(70,80);
		Point p2 = p1;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p2.x);
		p2.x=200;
		System.out.println(p1.x);
		System.out.println(p2.x);
		
		
		Point p3 = new Point(70,80);
		System.out.println(p3);	
		
		System.out.println("-------------------");
		Point p4 = new Point(10,20);
		System.out.println(p4.x);
		System.out.println(p4.y);
		rearange(p4);
		System.out.println(p4.x);
		System.out.println(p4.y);

	}
	static void rearange(Point abc) {
		abc.x = 30;
		abc.y = 40;
		System.out.println(abc);
	}

}

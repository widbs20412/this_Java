package p08_abstractclass;

public class Abstract_Gon {

	public static void main(String[] args) {
		Tetragon t1 = new Tetragon();
		t1.area(10, 20);
		Triangle t2 = new Triangle();
		t2.area(10, 20);
		
		Figure f1 = null;
		f1 = new Tetragon();
		f1.area(5, 6);
		f1 = new Triangle();
		f1.area(5, 6);

	}

}

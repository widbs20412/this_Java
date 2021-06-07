package p03.functional_inteface;

public class MyInterface_Impl implements MyInterface {

	@Override
	public void calculate(int x, int y) {
		int result = x*y;
		System.out.println(result);
	}

}

package p03.unary;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x =10;
		int y =10;
		int z;
		//System.out.println(z);
		
		x++;
		++x;
		System.out.println("x = "+x);	
		//System.out.println(++x);
		
		y--;
		--y;
		System.out.println("y = " +y);
		
		z =x++;
		System.out.println("z = " +z);//12
		System.out.println("x = " +x);//13
		
		z =++x;
		System.out.println("z = " +z);//14
		System.out.println("x = " +x);//14
		
		z =++x + y++;//15+8
		System.out.println("z = " +z);//23
		System.out.println("x = " +x);//15
		System.out.println("y = " +y);//9

	}

}

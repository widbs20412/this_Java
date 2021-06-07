package exercise;

public class ShopServiceExample {

	public static void main(String[] args) {
		//ShopService s = new ShopService(); //old 객체생성
		
		ShopService s1 =ShopService.getInstance();
		ShopService s2 =ShopService.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1 == s2)
			System.out.println("같다");
		else
			System.out.println("같지않다");
	}

}

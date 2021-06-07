package study08_nestedclass;

public class NestedClass1 {

	public static void main(String[] args) {
		
		PiggBank p1 = new PiggBank();
		PiggBank p2 = new PiggBank();
		PiggBank p3 = new PiggBank();
		p2.slot.put(100);
		System.out.println("첫번째 저금통: "+p1.total);
		System.out.println("두번째 저금통: "+p2.total);
		System.out.println("세번째 저금통: "+p3.total);
	}

}

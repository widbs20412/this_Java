package study08_nestedclass;

public class NestedClass2 {

	public static void main(String[] args) {
		
		PiggBank p1 = new PiggBank();
		PiggBank p2 = new PiggBank();
		PiggBank.Slot temp = p1.slot;
		 p1.slot = p2.slot;
		 p2.slot = temp;
		p1.slot.put(10000);
		p2.slot.put(10);
		System.out.println("첫번째 저금통: "+p1.total);
		System.out.println("두번째 저금통: "+p2.total);
		
	}

}

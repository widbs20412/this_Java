package study08_nestedclass;

public class PiggBank {
	int total;
	Slot slot;
	
	//생성자
	public PiggBank() {
		total=0;
		slot =new Slot();
	}
	//Instance Inner Class
	class Slot{
		void put(int amount) {
			total += amount;
		}
	}
}

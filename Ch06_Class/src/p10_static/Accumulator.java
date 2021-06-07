package p10_static;

//static : 공유변수
public class Accumulator {
	int total;
	static int grandTotal;
	
	void accumulate(int amount) {//10 20
		total += amount;//10 20
		grandTotal += amount;//10 +20
	}
	static int getGrandTotal() {
		return grandTotal;
	}

}

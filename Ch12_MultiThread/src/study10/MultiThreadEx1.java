package study10;

public class MultiThreadEx1 {

	public static void main(String[] args) {
		
		SharedArea sa = new SharedArea();
		sa.a1 = new Account("1111","알파고",20000000);
		sa.a2 = new Account("2222","베파고",10000000);
		TransferThread ta = new TransferThread(sa);
		PrintThread tb = new PrintThread(sa);
		ta.start();
		tb.start();

	}

}

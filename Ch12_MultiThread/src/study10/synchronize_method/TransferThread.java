package study10.synchronize_method;
//12번 인출,입금
public class TransferThread extends Thread {
  
	SharedArea sa;

	public TransferThread(SharedArea sa) {
		super();
		this.sa = sa;
	}
	
	@Override
	public void run() {
		for(int i=0; i<12; i++) {
			sa.transfer(100);
		}
	}
	
}

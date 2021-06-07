package exercise;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;//잔고
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance <Account.MIN_BALANCE || balance >Account.MAX_BALANCE)
			return;//호출한 곳에 값을 보낸다
		this.balance = balance; //실행되지 않는다
	}
	

}

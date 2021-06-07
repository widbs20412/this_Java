package exercise;

public class AccountExample {

	public static void main(String[] args) {
		Account a = new Account();//생성자를 이용한 방법1 -사용하려면 생성자 만들어서 하기!
		//a.balance =10000;//저장방법2
		a.setBalance(10000);//setter방식을 이용한 방법 3
		System.out.println("현재 잔고 : " + a.getBalance());
		a.setBalance(-10000);
		System.out.println("현재 잔고 : " + a.getBalance());
		a.setBalance(2000000);
		System.out.println("현재 잔고 : " + a.getBalance());

	}

}

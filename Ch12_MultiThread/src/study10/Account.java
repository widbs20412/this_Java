package study10;
//교재 : ~618 정리

//Synchronized Block, Synchronized Method 구현하기
public class Account {
   String accountNO;//계좌번호
   String ownerName;//예금주
   int balance;//잔고
   
   public Account(String accountNO, String ownerName, int balance) {
	super();
	this.accountNO = accountNO;
	this.ownerName = ownerName;
	this.balance = balance;
}

//입금
   void deposit(int amount) {
	   balance += amount;
   }
   
   //출금
   int withdraw(int amount) {
	   if(balance < amount) return 0;
	   balance -= amount;
	   return amount; 
   }
}

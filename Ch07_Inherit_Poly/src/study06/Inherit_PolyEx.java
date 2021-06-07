package study06;

public class Inherit_PolyEx {
	//field의 다형성=참조변수의 다형성=클래스변수의 다형성
		public static void main(String[] args) {
			System.out.println("-PolyMorphism 방법1------------------------------");
			Account obj1 = new Account("1111","홍길동",10000);
			CheckAccount obj2 = new CheckAccount("2222", "홍길동", 20000,"5555");
			CredLineAccount obj3= new CredLineAccount("3333", "알파고", 3000,2000000);
			BonusPointAccount obj4= new BonusPointAccount("4444", "드론", 0,0);
			
			printAccount(obj1);
			printAccount(obj2);
			printAccount(obj3);
			printAccount(obj4);
			
			System.out.println("-PolyMorphism 방법2------------------------------");
			Account ob = null;
			ob = new Account("1111","홍길동",10000);
			printAccount(ob);
			ob = new CheckAccount("2222", "홍길동", 20000,"5555");
			printAccount(ob);
			ob = new CredLineAccount("3333", "알파고", 3000,2000000);
			printAccount(ob);
			ob = new BonusPointAccount("4444", "드론", 0,0);
			printAccount(ob);
		}
		
	    static void printAccount(Account obj) {
	    	System.out.println("계좌번호: "+obj.accountNo);
	    	System.out.println("예금주: "+obj.ownerName);
	    	System.out.println("잔액: "+obj.balance);
	    	System.out.println();
	    }
	}

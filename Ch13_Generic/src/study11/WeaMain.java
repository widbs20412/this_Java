package study11;

import java.util.Scanner;

public class WeaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WeaCon con = new WeaCon(); 
		con.input();
		while(true) {
			System.out.println("1.날씨검색 2.종료");
			int sel = sc.nextInt();
			if(sel ==1) {
				System.out.println("도시명 입력: ");
				String name = sc.next();
				con.search(name);
			}else {
				System.out.println("종료");
				break;
			}
				
		}
		

	}

}

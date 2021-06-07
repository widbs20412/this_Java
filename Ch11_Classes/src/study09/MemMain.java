package study09;

import java.util.Scanner;

public class MemMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수 입력? :");
		Mem[] m = new Mem[sc.nextInt()];
		while(true) {
			System.out.println("번호 입력하기?(1.정보입력, 2.정보출력,3.비만정도출력,4.종료) ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("[회원정보입력]");
				for(int i=0;i<m.length;i++) {
//					m[0] = new Mem(); 배열 사용할 때는 객체 생성 잊지말기!!!
//					m[1] = new Mem();
					m[i] = new Mem();
					m[i].in();
				}
			}else if(sel ==2) {
				for(int i=0;i<m.length;i++) 
					m[i].prn();			
			}else if(sel ==3) {
				for(int i=0;i<m.length;i++) {
					System.out.println("차이값은? " +m[i].jung() );
					System.out.println("-------------------------");
				}
			}else if(sel ==4) {
				System.out.println("[종료]");
				break;
			}else {
				System.out.println("[다시 선택하기]");
			}
			
		}
	}

}

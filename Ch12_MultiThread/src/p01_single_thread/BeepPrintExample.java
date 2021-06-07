package p01_single_thread;

import java.awt.Toolkit;

public class BeepPrintExample {
//Single Thread: 프로세스안에 실행흐름이 하나 인것
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			tk.beep();
			System.out.println("aaa!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		for(int i=0; i<5;i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

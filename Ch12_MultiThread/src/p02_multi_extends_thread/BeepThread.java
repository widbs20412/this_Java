package p02_multi_extends_thread;

import java.awt.Toolkit;
//작업스레드1 : Thread를 상속 받음 - 메인스레드와 다른 독자적인 실행흐름을 갖는다.
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			tk.beep();
			System.out.println("aaa!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

package p07_daemon;

public class DaemonExample {
	//Main Thread(주)
	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);//데몬(보조Thread: 주Thread가 종료하면 보조Thread는 종료)
		at.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}
}

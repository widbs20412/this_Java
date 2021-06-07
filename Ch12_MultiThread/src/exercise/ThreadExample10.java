package exercise;

public class ThreadExample10 {

	public static void main(String[] args) {
		Thread th3 = new MovieThread10();
		th3.setDaemon(true);
		th3.start();
		try {
			th3.sleep(3000);
		} catch (InterruptedException e) {
			
		}

	}

}

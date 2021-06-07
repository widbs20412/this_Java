package exercise;

public class ThreaExample08 {

	public static void main(String[] args) {
		Thread th2 = new MovieThread08();
		th2.start();
		try {
			th2.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		th2.interrupt();

	}

}

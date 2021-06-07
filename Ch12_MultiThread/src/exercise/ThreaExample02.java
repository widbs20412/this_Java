package exercise;

public class ThreaExample02 {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread02();
		thread1.start();
		
		Thread thread2 = new MusicRunnable02();
		thread2.start();
		
		//Thread thread2 = new Thread(new MusicRunnable());
	}

}

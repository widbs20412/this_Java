package p04_synchron;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");//스레드 이름을 User1로 설정
		this.calculator = calculator;//공유 객체인 Calculator를 필드에 저장
	}
	
	@Override
	public void run() {//공유 객체인 Calculator의 메모리에 100을 저장
		calculator.setMemory(100);
	}
}

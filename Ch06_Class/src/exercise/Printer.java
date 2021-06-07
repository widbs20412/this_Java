package exercise;

public class Printer {
	void println(int value) {
		System.out.println(value);
	}
	void println(boolean value) {
		System.out.println(value);
	}
	void println(double value) {
		System.out.println(value);
	}
	void println(String value) {
		System.out.println(value);
	}
	
	static void printlns(int value) {
		System.out.println(value);
	}
	static void printlns(boolean value) {
		System.out.println(value);
	}
	static void printlns(double value) {
		System.out.println(value);
	}
	static void printlns(String value) {
		System.out.println(value);
	}
	
	//일반메소드
	void print() {
		return;
	}
	//기본생성자 -생성자는 대문자!!! 잊지말기
	public Printer() {
		
	}

}

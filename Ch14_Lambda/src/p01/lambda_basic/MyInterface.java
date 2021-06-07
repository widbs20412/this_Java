package p01.lambda_basic;

public interface MyInterface {
	// 1. 고정 상수
	static final int A = 100;

	// 2. 추상메소드
	void add();

	// 3.default()
	default int sub() {
		return 0;
	}

	// 4.static()
	static int mul() {
		return 0;

	}
}

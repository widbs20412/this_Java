package p09_instance;

class Car {
//intance Member(변수,메소드)
	int a;
	int add(int a, int b) {
		return 10;
	}
//static Member(변수,메소드)
	static int b;
	static int sub(int a, int b) {
		int result = a+b;
		return a;
	}
}

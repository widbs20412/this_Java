package p07_polymorphism_array;

public class ArrayMain {

	public static void main(String[] args) {
		//배열?
		ArrayMethod[] am = new ArrayMethod[2];
		am[0] = new ArrayMethodInheritA();
		am[1] = new ArrayMethodInheritB();
		
		//부모의 눈으로 for문 만들고 반복하기
		for(int i=0; i<am.length;i++) {
			am[i].showSleepStyle();
		}
		

	}

}

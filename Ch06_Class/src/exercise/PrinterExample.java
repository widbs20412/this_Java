package exercise;

public class PrinterExample {

	public static void main(String[] args) {
		//인스턴스 메소드 호출(16번)
		Printer p = new Printer();
		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
		
		//static 메소드 호출(17번)
		Printer.printlns(20);
		Printer.printlns(false);
		Printer.printlns(16.7);
		Printer.printlns("이순신");
	}

}

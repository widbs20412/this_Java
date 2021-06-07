package p06__field;

public class carExample {

	public static void main(String[] args) {
		//1.변수를 통한 저장+출력
		Car c1 = new Car();
		c1.company = "현대자동차";
		c1.model = "그랜저";
		c1.color = "검정";
		c1.maxSpeed = 350;
		c1.speed =50;
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		
		//2.생성자를 통한 저장+출력
		Car c2 =new Car("현대자동차2","그랜저2","검정2",400,100);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println(c2.speed);
		//3.getter()setter()를 통한 저장+출력
		Car c3 = new Car();
		c3.setCompany("현대자동차3");
		c3.setModel("그랜저3");
		c3.setColor("검정3");
		c3.setMaxSpeed(450);
		c3.setSpeed(150);
		System.out.println(c3.getCompany());
		System.out.println(c3.getModel());
		System.out.println(c3.getColor());
		System.out.println(c3.getMaxSpeed());
		System.out.println(c3.getSpeed());
		
		
	}

}

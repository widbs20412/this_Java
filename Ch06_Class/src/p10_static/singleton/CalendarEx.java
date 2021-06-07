package p10_static.singleton;

import java.util.Calendar;
//Calendar :추상클래스이므로 객체생성 불가
public class CalendarEx {

	public static void main(String[] args) {
		//Calendar class : 추상클래스 이므로 자식 객체생성 대신 Singleton형식으로 클래스 내용
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		System.out.println(year +"/"+month+"/"+day);
		

	}

}

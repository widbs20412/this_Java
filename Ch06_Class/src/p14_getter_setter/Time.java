package p14_getter_setter;

public class Time {
	public int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
//		this.hour = hour;// 0~23
//		this.minute = minute;// 0~59
//		this.second = second;// 0~59
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	@Override
	public String toString() {

		return hour + ":" + minute + ":" + second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

}

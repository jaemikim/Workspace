package kr.co.himedia.informationhiding;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 ||  hour > 23) {
			System.out.println("시간을 잘못 입력했다.");
			//return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력했습니다.");
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("초를 잘못 입력했습니다.");
			//return; 값으로 밖으로 나가게 되어서 초기값으로 들어간다. 
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() + "시 " + this.getMinute() + "분 "+ this.getSecond() + "초";	
		//"Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
		
}

//변수,
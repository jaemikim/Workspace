package kr.co.himedia.inheritance;

//독립클래스
public class Point {
    //멤버변수
	int x;
	int y;
	
	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		//super();
		System.out.println("Point 클래스이 매개변수가 있는 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
	
}

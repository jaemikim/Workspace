package kr.co.himedia.inheritance;


public class Circle extends Shape {

	Point center;		// 원점
	int radius;
	
	public Circle() {
		this(new Point(0, 0), 100);
	}

	public Circle(Point center, int radius) {
		super();
		System.out.println("Circle 클래스의 매개변수가 있는 생성자 호출");
		this.center = center;
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("색깔 : " + this.color);
		System.out.println("원점 : (X : " + this.center.x + ", Y : " + this.center.y + ", 반지름 : " + this.radius + ")");				
	}
}

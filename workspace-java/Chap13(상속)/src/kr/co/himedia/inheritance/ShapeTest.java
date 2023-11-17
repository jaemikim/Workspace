package kr.co.himedia.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150, 150), 500); //객체를 만든다
		circle2.draw();
		
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		
		System.out.println();
		
		Triangle triangle2 = new Triangle(new Point(10, 10), new Point(20, 20), new Point(30, 30));
		triangle2.draw();
		
		System.out.println();
		
	   //참조변수
		Point[] points = new Point[] {new Point(25, 25), new Point(50, 50), new Point(75, 75)};
		Triangle triangle3 = new Triangle();
		triangle3.draw();
	}
}

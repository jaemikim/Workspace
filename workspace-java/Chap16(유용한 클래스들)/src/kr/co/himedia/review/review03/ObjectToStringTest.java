package kr.co.himedia.review.review03;

public class ObjectToStringTest {

	public static void main(String[] args) {
		Board b = new Board();
		b.setTitle("가을 날씨 청청");
		System.out.println(b.getTitle());
		System.out.println(b);  // 해시코드값 출력(주소번지값)
		System.out.println(b.toString());
	}
}

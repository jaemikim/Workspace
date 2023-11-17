package kr.co.himedia.review.review02;

public class InterfaceTest {
	/**
	 * 리모콘으로 Radio와 TV를 동작시키기
	 */
	public static void main(String[] args) {
		
		Remocon remo = new Radio();
		remo.channelUp();
		remo.channelDown();
		remo.volumeUp();
		remo.volumeDown();
		remo.internet();
		
		System.out.println();
		
		remo = new TV();
		remo.channelUp();
		remo.channelDown();
		remo.volumeUp();
		remo.volumeDown();
		remo.internet();		
		
	}
}

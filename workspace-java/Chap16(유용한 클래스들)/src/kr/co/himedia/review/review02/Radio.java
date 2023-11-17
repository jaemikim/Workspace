package kr.co.himedia.review.review02;

public class Radio implements Remocon {

	@Override
	public void channelUp() {
		System.out.println("Radio의 채널이 올라간다.");
	}

	@Override
	public void channelDown() {
		System.out.println("Radio의 채널이 내려간다.");		
	}

	@Override
	public void volumeUp() {
		System.out.println("Radio의 볼륨이 올라간다.");		
	}

	@Override
	public void volumeDown() {
		System.out.println("Radio의 보륨이 내려간다.");		
	}

	@Override
	public void internet() {
		System.out.println("인터넷이 연결이 안된다");
	}

}

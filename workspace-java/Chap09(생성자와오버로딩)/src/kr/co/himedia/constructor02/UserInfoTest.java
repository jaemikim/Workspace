package kr.co.himedia.constructor02;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userInfo0 = new UserInfo();
		userInfo0.userId = "hello";
		userInfo0.userPassWord = "0303";
		userInfo0.userName = "shin sa";
		System.out.println(userInfo0.showUserIfo());
		
		System.out.println();
		
		UserInfo userInfo = new UserInfo("himedia", "0308", "Admiral Lee");
		System.out.println(userInfo.showUserIfo());
		
		
	}
}

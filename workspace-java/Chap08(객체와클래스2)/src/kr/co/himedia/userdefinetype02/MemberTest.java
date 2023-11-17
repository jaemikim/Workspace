package kr.co.himedia.userdefinetype02;

//이순신, 30, 010-1234-5678, admiral@gmail.com, 서울, 80.6kg
public class MemberTest {

	public static void main(String[] args) {
		
		Member member = new Member();  //스택에 번지수가 들어간다. 
	
		member.memberName = "이순신";
		member.memberAge = 30;
		member.memberPhon = "010-1234-5678";
		member.memberEmail = "admiral@gmail.com";
		member.memberAdd = "서울";
		member.memberWeight = 80.6f;
		
		System.out.println(member.memberName + "\t" + member.memberAge + "\t" + member.memberPhon + "\t" + member.memberEmail + "\t" + member.memberAdd + "\t" + member.memberWeight);
	
	}
}

package kr.co.himedia.set03;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet meberTreeSet = new MemberTreeSet();		
		
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		Member memberS2 = new Member(2026, "류성룡");
		
		meberTreeSet.addMember(memberL);
		meberTreeSet.addMember(memberW);
		meberTreeSet.addMember(memberR);
		meberTreeSet.addMember(memberS);
		meberTreeSet.addMember(memberS2);
		
		meberTreeSet.showAllMember();
	}
}

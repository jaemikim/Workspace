package kr.co.himedia.enumkeyword;

enum Human {MAN, WOMAN};
enum Machine {CAR, AIRPLANE};

public class EnumTest {

	public static void main(String[] args) {
		
		createUnit(Machine.CAR);
//		createUnit(Human.MAN);   잘못된 사용  => 에러남		
//		if(Human.MAN == 0) {};   숫자로 비교하면 에러가 남 
	}
	private static void createUnit(Machine kind) { //콜바이레퍼런스
		switch (kind) {
		case CAR:
			System.out.println("자동차를 만듭니다..");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
//		default:
//			break;
		}
	}
}

package kr.co.himedia.constructor05;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.height = 185;
		person.weight = 85;
		person.gender = "남성";
		person.name = "이순신";
		person.age = 40;
		
		System.out.println(person.toString());
		
		person.showInfo(); //Person.java에서 print를 설정해 노핬기 때문에 바로 출력된다. 
	}
}

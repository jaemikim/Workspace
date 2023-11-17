package kr.co.himedia.constructor05;

// 다음에 해당되는 객체를 구현하고 해다 값들을 출력하시오.
// 키가 185이고 몸무가게 85 킬로드 남성이 있습니다. 이름은 이순신이고 나이는 40세입니다.
public class Person {

    float height;
    float weight;
    String gender;
    String name;
    int age;  
    
      
    
    @Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", gender=" + gender + ", name=" + name + ", age="
				+ age + "]";
	}
   
    public void showInfo() {
    	System.out.println(this.age +", " + this.name);
    }
    
}

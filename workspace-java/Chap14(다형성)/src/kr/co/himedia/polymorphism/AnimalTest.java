package kr.co.himedia.polymorphism;

import java.util.ArrayList;

class Animal {
	//메서드 추가
	public void move() {
		System.out.println("동물이 움직인다.");
	}
	
	public void eat() {
		System.out.println("동물이 먹습니다.");
	}
}

class Dog extends Animal {	
	@Override
	public void move() {
		System.out.println("개가 네발로 걷습니다.");
	}
	
	public void playBall() {
		System.out.println("개가 견주가 던지 공을 물어옵니다.");
	}
}

class Tiger extends Animal {	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void pickup() {
		System.out.println("독수리가 물고기를 체갑니다.");
	}
}
public class AnimalTest {  // 상위 기준으로 생성한다.

	public static void main(String[] args) {
		Animal daAnimal = new Dog();     
		Animal taAnimal = new Tiger();
		Animal eaAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();  //AnimalTest 생성
		test.moveAnimal(eaAnimal);
		test.moveAnimal(taAnimal);
		test.moveAnimal(daAnimal);
		
		System.out.println();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>(); //Animal 상위 타입으로 설정해서 다 들어갈수 있다. 
		animalList.add(eaAnimal);
		animalList.add(taAnimal);
		animalList.add(daAnimal);
		
		//향상된 for문
		for(Animal animal : animalList) 
			animal.move();
		
		System.out.println();
		
		test.checkDownCast(animalList); 
	}
	
	public void checkDownCast(ArrayList<Animal> animalList) {
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			
			if(animal instanceof Dog) {
				Dog danimal = (Dog)animal;
				danimal.playBall();
			} else if(animal instanceof Tiger) {
				Tiger tanimal = (Tiger)animal;
				tanimal.hunt();			
			} else if (animal instanceof Eagle) {
				Eagle eanimal = (Eagle)animal;
				eanimal.pickup();
			}
		}
}

	public void moveAnimal(Animal animal) {  //상위 클래스 정의
		animal.move();
		
	}
}

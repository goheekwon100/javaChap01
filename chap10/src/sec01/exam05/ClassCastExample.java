package sec01.exam05;

public class ClassCastExample {
	
	public static void main(String[] args) {
		Animal animal = new Dog();
//		Dog dog = animal; //컴파일 예외 발생
		Dog dog = (Dog) animal; //캐스팅 필요
		
//		Cat cat = animal; //컴파일 예외 발생
//		Cat cat = (Cat) animal; //캐스팅 예외 발생
		
		changeDog(new Dog());
		changeDog(new Cat());
	}

	//
	private static void changeDog(Animal animal) {
		// 안전하게 타입 검사 후 캐스팅 진행
		if(animal instanceof Dog dog) {
			System.out.println(dog + "변경 완료");
		}else {
			System.out.println(animal + "변경 실패");
		}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

// public 생략시 default
// 클래스는 접근제어자 public, default 끝



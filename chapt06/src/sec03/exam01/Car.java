package sec03.exam01;

public class Car {
	
	
	
	// 생성자 오버로딩
	Car(){
		System.out.println("기본 자동차가 생성됨");
	}
	Car(String color, int cc){
		System.out.println(color + "색의 배기량" + cc + "cc 자동차가 생성됨");
	}
}

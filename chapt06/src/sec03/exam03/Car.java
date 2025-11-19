package sec03.exam03;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 300;
	int speed;
	
	//총 4개의 생성자 오버로딩
	
	Car() {
		System.out.println("기본차 객체 생성");
	}
	Car(String model){
		this.model = model;
		System.out.println("모델 지정 객체 생성");
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
		System.out.println("모델 및 컬러 지정 객체 생성");
	}
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
		System.out.println("모델 및 최고속도 지정 객체 생성");
	}
}

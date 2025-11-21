package sec03.exam04;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//총 4개의 생성자 오버로딩
	
	Car() {
//		this.model = "자가용";
//		this.color = "은색";
//		this.maxSpeed = 350;
		this("자가용","은색",350);
	}
	Car(String model){
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 350;
		this(model,"은색",350);
	}
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 350;
		this(model,color,350);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		carInfo();
	}
	
	void carInfo() {
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("최고속도: " + maxSpeed + "\n");
	}
}

package sec05.exam03;

public class Car {
	// 인스턴스 필드
	int speed;
	
	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "km/h로 달립니다.");
	}
	// 정적 메소드
	static void test() {
		//정적메소드 내에서는 인스턴스 및 this 키워드 사용 불가
		//사용하고 싶다면 객체 생성 후 사용, 단, 권장하지 않음
//		speed = 60; none-static 필드 사용 불가
//		run(); 인스턴스 메소드 사용 불가
		
		Car testCar = new Car();
		testCar.speed = 60;
		testCar.run();
	}
	
	//main 메소드
	public static void main(String[] args) {
		Car.test();
		test();
	}
}

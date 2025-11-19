package sec02.exam01;

public class Car {
	//필드: 객체의 데이터
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 300;
	int speed;
	// 클래스 내부에서의 필드 사용
	// => 필드 이름으로 사용
	
	//생성자
	Car() {
		speed = 30;
		System.out.println(company);
	}	
	
	//메소드
	void method() {
		speed = 50;
		System.out.println(model);
	}
	void currentSpeed() {
		System.out.println("현재 속도: " + speed);
	}
	void accelate() {
		speed++;
		if(speed > maxSpeed) {
			speed = maxSpeed;
			System.out.println("최고속도에 도달했습니다.");
			return;
		}
		System.out.println("악셀을 밟았습니다.");
		currentSpeed();
	}
	void powerAccelate() {
		speed+=10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
			System.out.println("최고속도에 도달했습니다.");
			return;
		}
		System.out.println("급가속 했습니다.");
		currentSpeed();
	}
	void carBreak() {
		speed--;
		if(speed < 0) {
			speed = 0;
			System.out.println("차가 멈췄습니다.");
			return;
		}
		System.out.println("브레이크를 밟았습니다.");
		currentSpeed();
	}
	void carPowerBreak() {
		speed -= 10;
		if(speed < 0) {
			speed = 0;
			System.out.println("차가 멈췄습니다.");
			return;
		}
		System.out.println("급 브레이크를 밟았습니다.");
		currentSpeed();
	}
}

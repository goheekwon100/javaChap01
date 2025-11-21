package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 다른 클래스 접근시 필드 사용
		// => 객체.필드명
		
		Car newCar = new Car();
		
		newCar.currentSpeed();
		newCar.accelate();
		newCar.accelate();
		newCar.accelate();
		newCar.accelate();
		for (int i = 0; i < 40; i++) {
			newCar.powerAccelate();
		}
		
	}
}

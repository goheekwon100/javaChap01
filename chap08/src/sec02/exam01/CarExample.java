package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car newCar = new Car();
		newCar.run();
		
		newCar.frontLeftTire = new KumhoTire();
		newCar.frontRightTire = new KumhoTire();
		
		newCar.run();
	}
}

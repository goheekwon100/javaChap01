package sec05.exam01;

public class CarExample {
	public static void main(String[] args) {
		System.out.println(Car.objNumber);
//		Car.objNumber = 1111; //objNumber는 final로 선언했기 때문에 수정 불가
		System.out.println(Car.objNumber);
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.setSpeed(100);
		yourCar.run();
		
		System.out.println("나의 자동차: " + myCar.speed);
		System.out.println("너의 자동차: " + yourCar.speed);
		
		Car.carSound();
	}
}

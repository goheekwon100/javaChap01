package sec02.exam02;

public class Driver {
	
	// 매개변수로 Vehicle 인터페이스를 구현한 다양한 구현체를 인자로 받을 수 있다.
	public void drive(Vehicle vehicle) {
		vehicle.run(); //추상메소드 호출 => 구현체 재정의된 run()이 호출됨.
	}
}

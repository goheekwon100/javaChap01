package sec02.exam04;

public class Driver {
	//매개변수를 부모타입으로 선언하여, 자식타입의 객체 모두 매개변수로 사용가능
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

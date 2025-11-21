package sec04.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(10);
		if (myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}else {
			System.out.println("연료가 없습니다.");
		}
		myCar.setGas(10);
	}
}

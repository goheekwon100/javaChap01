package sec04.exam03;

public class Car {
	int gas;

	// 메소드
	// 필드의 값을 세팅해주는 메소드, 세터메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas-- + ")");
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
//				return;
				break;
			}
		}
	}
}

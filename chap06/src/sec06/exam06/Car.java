package sec06.exam06;

// 아무것도 안 붙이면 default 접근 제한 -> 같은 패키지에서만 사용할 
public class Car {
	// 필드
	// 특별한 이유가 없다면 모든 필드는 기본적으로 private 캡슐화
	private int speed;
	private boolean stop;
	
	private String fuelName;
	private String fuelQuantity;
	
	
	
	public int getSpeed() { //getter만 존재하는 필드는 읽기전용필드.
		return speed;
	}
	public void setSpeed(int speed) {
		// 유효성 검사 추가
		if (speed < 0) {
			this.speed = 0;
			return; //ERP Early Return Pattern
		}
		this.speed = speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		setSpeed(0);
	}
	
	public String getFuelName() {
		return fuelName;
	}
	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}
	public String getFuelQuantity() {
		return fuelQuantity;
	}
	public void setFuelQuantity(String fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}
}

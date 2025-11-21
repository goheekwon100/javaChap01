package sec01.exam04;

//Airplane 상속, 초음속 기능 추가
public class SupersonicAirplane extends Airplane{
	// 비행모드 상수 선언
	public static final int NORMAL = 1; 
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}
	
	public void toggleFlyMode() {
		if (flyMode == NORMAL) {
			flyMode = SUPERSONIC;
			System.out.println("비행모드가 초음속 비행 모드로 변경되었습니다.");
		}else {
			flyMode = NORMAL;
			System.out.println("비행모드가 일반 비행 모드로 변경되었습니다.");
		}
	}
	
}

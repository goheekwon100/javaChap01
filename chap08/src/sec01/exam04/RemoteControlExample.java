package sec01.exam04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new RemoteControl(); // 인터페이스는 객체의 사용 방법만을 기술한 타입 => 객체 생성 불가
		
		// 그 대신 인터페이스 타입에 구현객체(구현체)를 담을 수 있다.
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// 정리 : 메소드 호출 코드는 동일한데 구현체에 따라 실행 결과는 달라진다. => 다형성
	}
}

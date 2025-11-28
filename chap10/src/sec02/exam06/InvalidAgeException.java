package sec02.exam06;

// 사용자 정의 예외 클래스 만들기
// 자바에서 제공하는 표준 예외 클래스 외 상황에 맞는 예외 필요시 사용
// Exception 또는 RuntimeException 상속받아 사용
// Exception 상속시 일반 예외(체크)
// RuntimeException 상속시 실행 예외(언체크,논체크)
public class InvalidAgeException extends RuntimeException{ //실행 중 잘못된 값으로 예외가 발생할 경우
	public InvalidAgeException(String message) {
		super(message); // 부모 생성자에 예외 메시지 전달
	}
	
}

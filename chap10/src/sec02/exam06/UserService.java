package sec02.exam06;

public class UserService {
	public void registerUser(int age) {
		if (age < 0) {
			// throw: 예외 발생
			throw new InvalidAgeException("나이는 0보다 작을 수 없습니다.");
			// (참고) 만약 InvalidInputException 처럼 예외를 범용적으로 만들면
			// 메시지를 구체화하여 작성 시 어떤 문제가 발생됐는지 확인 가능
		}
		System.out.println("사용자 등록 완료 (나이: " + age + ")");
	}
}

package sec02.exam02.quiz;

public class Calculator {
//	각 메소드의 명칭과 리턴은 다음과 같습니다.
//	(return 하는 값은 전부 int 타입)
//	  - add: 두 수 더하기
//	  - multiple: 두 수 곱하기
//	  - divide: 두 수 나누기 몫
	
	public static int add(int x, int y) {
		int result = x + y;
		return result;
	}
	public static int multiple(int x, int y) {
		int result = x * y;
		return result;
	}
	public static int divide(int x, int y) {
		int result = x / y;
		return result;
	}
}

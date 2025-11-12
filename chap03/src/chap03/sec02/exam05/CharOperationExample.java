package chap03.sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		// 참고만 할 것!
		// 리터럴끼리의 연산은 실행전 컴파일 타임에 계산하고, 실제 바이트 코드(컴파일로 생성되는 코드)에 결과값만 넣음
		// 상수는 선연산 후 대입
		// 변수는 컴파일 이후 실행 시점에 연산. 컴파일오류 발생
		char c1 = 'A';
		c1 += 'A' + 1;
//		c1 = c1 + 'A' + 1; 이건 불가.

		System.out.println(c1);
		c1 += c1 + 2; //복합연산자에는 형변환이 자동으로 이뤄짐, 대입연산자는 형변환 필요시 캐스팅 필요
	}
}

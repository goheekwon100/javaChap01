package sec05.exam02;

public class CalculatorExample {
	// 반지름이 10cm인 원의 넓이 구하기
	
	public static void main(String[] args) {
		// 정적 필드 선언 부로 메모리 낭비, 객체 불필요, 참조횟수 증가
//		Calculator calc = new Calculator();
//		double result = calc.pi;
		
		//정적 필드
		System.out.println(Calculator.pi); //Math.PI 동일
		
		//정적 메소드
		double result = Calculator.areaCircle(15);
		System.out.printf("%.2f\n", result);
		//참고 : 주로 유틸리티 기능에 쓰임
		
		
	}
}

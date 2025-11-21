package sec04.exam06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();//기본생성자 호출
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		
		// println() 오버로딩 구현 확인해보기
	}
}

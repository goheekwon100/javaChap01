package sec04.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();//기본생성자 호출
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		int result2 = myCalc.minus(5, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		
		myCalc.powerOff();
	}
}

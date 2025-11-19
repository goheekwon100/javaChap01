package sec04.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();//기본생성자 호출
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		double result2 = myCalc.avg(5,6);
		
		System.out.println(result1);
		System.out.println(result2);
		
		myCalc.execute();
		
		myCalc.powerOff();
	}
}

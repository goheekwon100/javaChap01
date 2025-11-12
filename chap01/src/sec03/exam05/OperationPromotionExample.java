package sec03.exam05;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue = byteValue1 + byteValue2;
		
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		
		System.out.println("유니코드=" + intValue2);
		System.out.println("유니문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		
		System.out.println(intValue4 + 0.5);
		
		
		int num1 = 10;
		double num2 = 5.7;
		System.out.println("[결과]");
		System.out.println("정수 결과:" + (num1 + (int)num2));
		System.out.println("실수 결과:" + (num1 + num2));
	}
}

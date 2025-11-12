package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		long lvar = 0xFFFFFFFFFFFFFFFL;
		float fvar = lvar;
		
		System.out.println(lvar);
		
		System.out.println(fvar);
		
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte 자동 형 변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '각';
		intValue = charValue; //자동 형변환
		System.out.println("intValue: " + intValue); //각에 해당하는 유니코드값 출력
		
		intValue = 30;
		long longValue = intValue;
		System.out.println("intValue: " + intValue); //30이 형변환 진행
		
		longValue = 1000000000000000000L;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue); //30이 형변환 진행
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("Double Value: "+ doubleValue);
		
		//주의필요, byte타입을 char타입으로는 자동형변환 불가, 값의 범위를 포함하지 못함.
//		byte byteVal = 65;
//		char charVal = byteVal;
		
		
		
	}
}

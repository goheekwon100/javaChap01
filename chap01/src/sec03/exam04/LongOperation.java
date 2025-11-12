package sec03.exam04;

public class LongOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 1;
		long var2 = 2;
//		byte var3 = var1 + var2;
		long var3 = var1 + var2; //
		
		System.out.println(var3);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result2 = value1 + value2; //int가 long타입으로 자동형변환 후 초기화
		
		result2 += value3; //long + long 계산
		
		System.out.println(result2);
	}

}

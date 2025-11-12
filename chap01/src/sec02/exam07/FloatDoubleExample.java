package sec02.exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// float(4byte), double(8byte)
		// 부동소수점: 가수 * 10의 지수 제곱으로 표현
		// 부동소수점 방식으로 저장 => 같은 크기를 갖는 int(4byte), long(8byte) 보다 더 큰 범위를 저장할 수 있음
		
//		float var1 = 3.14; 컴파일 오유 발생, 실수 리터럴 기본값 double타입으로 해석
		float var1 = 3.14F; //f또는 F를 붙여 형 명시 해줘야함.
		
		double var2 = 314e-2;
		double var3 = 3.14;
		 
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		double var4 = 3e6;
		System.out.println(var4);
		double var5 = 3e-6;
		System.out.println(var5);
		float var6 = 3e6f;
		System.out.println(var6);
		
		
		
	}
}

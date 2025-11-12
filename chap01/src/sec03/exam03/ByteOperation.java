package sec03.exam03;

public class ByteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 1;
		byte var2 = 2;
//		byte var3 = var1 + var2; //int 미만의 변수형은 연산시 int형으로 자동변환, byte변수에 연산값 저장불가
		byte var3 = (byte)(var1 + var2); //(byte)캐스팅시 저장 가능
		
		System.out.println(var3);
		
		int var4 = 10;
		double var5 = 10.0;
		
		double var6 = var4+var5; //int 형과 double형을 연산시에는 int타입의 변수가 double로 자동 형변환 후 연산
		System.out.println(var6);
		System.out.println( " " + var4 + var5 + " "); //문자열이 앞에 있는 경우 순서대로 연산하므로 문자열+int 는 int가 문자열로 형변환 되어 계산
		
		
	}

}

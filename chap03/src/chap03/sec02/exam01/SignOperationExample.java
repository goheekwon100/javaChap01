package chap03.sec02.exam01;

public class SignOperationExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		byte b = 100;
		int result3 = -b; //int 이하 정수 산술시 연산은 int로 변환 
		
		System.out.println("result3= " + result3);
		
		char c = 21504;
		int result4 = (char)-c; //이때의 c는 int형이므로 -를 붙여도 오류가 발생하지 않음.
		System.out.println("result4= " + result4);
		System.out.println("result5= " + (char)21504);
		System.out.println("result6= " + (char)44032);
		
		
	}
}	

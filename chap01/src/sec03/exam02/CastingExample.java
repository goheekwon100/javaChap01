package sec03.exam02;

import java.util.Scanner;

public class CastingExample {
	public static void main(String[] args) {
		long lvar = 0xFFFFFFFFFFFFFFFFL;
		System.out.println(lvar);
		
		int ivar = (int)lvar;
		System.out.println(ivar);
		
		int intValue = 65601;
		
		char charValue = (char)intValue; //값의 손실 발생
		System.out.println(charValue);
		
		long longValue = 5000000000L; //
		intValue = (int) longValue; // 강제 형변환시 마지막 4byte만 넣음
		System.out.println(intValue); //값의 손실 발생
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		
		long number = 100000L;
		System.out.println((int)number);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("long 타입 입력: ");
		number = sc.nextLong();
		sc.close();
		
		
		System.out.println((int)number);
	}
}

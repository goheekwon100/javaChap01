package chap03.sec02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// 주로 짝수/홀수, 배수를 확인할 때 사용
		// 예) 3의 배수 확인 => 9 % 3 == 0 이 나오면 3의 배수
		
		//Quiz 2자리 정수 입력받아 10의 자리 미만 버리세요
		
		Scanner sc = new Scanner(System.in);
		
		int var1;
		var1 = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		System.out.println(var1 - var1 % 10);
		System.out.println(var1 / 10 * 10);
		
	}

}

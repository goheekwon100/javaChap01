package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;
		for (;;) {
			if (i > 100) {
				break;
			}
			sum += i;
			i += 2;
		}

		System.out.println("1~" + (i - 1) + " 합: " + sum);

		// 참고 무한루프
		
		int count = 0;
		for(;;) {
			if (count > 5) {
				break;
			}
			System.out.println(count+=1);
		}
		
		// Quiz1: 1부터 100까지 짝수의 합
		
		int total=0;
		for(i=1;i<=100;i++) {
			if(i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합: " + total);
		
				// Quiz2: 
//				숫자를 입력받아 입력받은 수가 
//				짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//				홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//				을 구하는 프로그램을 구현하시오
		//
//				[입력]  [출력]
//				 10  => 30
//				 11  => 36
		int scanNum;
		Scanner sc = new Scanner(System.in);
		scanNum = sc.nextInt();
		sc.close();
		
		total = 0;
		int num = scanNum % 2;
		
		for (i=1;i<=scanNum;i++) {
			if(i % 2 == num) {
				total += i;
			}
		}
		
		System.out.println("1부터 " + scanNum + "까지 " + ((num==0)?"짝":"홀") + "수의 합: " + total);
		
	}
}
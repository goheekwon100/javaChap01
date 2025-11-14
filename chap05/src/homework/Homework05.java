package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		int num;
		while (true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			num = sc.nextInt();
			if(num > 0) {
				sum += num;
			}else if (num ==0) {
				break;
			}
		}
		System.out.println("양수의 합계 : " + sum);
		sc.close();
	}
}

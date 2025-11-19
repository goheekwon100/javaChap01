package homework.loop;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		while(num<1 || num>50) {
			System.out.print("정수(1~50): ");
			num = sc.nextInt();
			if(num<1 || num>50) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			}
		}
		sc.close();
		int sum=0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;	
			}
		}
		System.out.println("합계: " + sum);
	}
}

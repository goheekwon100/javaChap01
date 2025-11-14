package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();		
		
		System.out.println("구슬의 개수 : " + num);
		System.out.println("구슬의 개수는" + ((num%2== 0)?("짝수"):("홀수")) + "입니다.");
	}
}

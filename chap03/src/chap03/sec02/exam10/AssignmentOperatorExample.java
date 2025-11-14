package chap03.sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
//		int result = 10;
		
//		result += 10;
//		System.out.println("result= " + result);
//		result -= 5;
//		System.out.println("result= " + result);
//		result *= 10;
//		System.out.println("result= " + result);
//		result /= 10;
//		System.out.println("result= " + result);
//		result %= 7;
//		System.out.println("result= " + result);
//		
//		
//		result ^= 10;
//		System.out.println("result= " + result);
//		
//		result |= 10;
//		System.out.println("result= " + result);
//		
//		result &= 10;
//		System.out.println("result= " + result);
		
		
		//Quiz 자판기 만드세요.
		int money;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("동전으로 교환하고 싶은 금액(원)을 입력하세요: ");
		money = sc.nextInt();
		sc.close();
		
//		int coin500,coin100,coin50,coin10,coin1;
//		coin500 = money / 500;
//		money = money % 500;
//		coin100 = money / 100;
//		money = money % 100;
//		coin50 = money / 50;
//		money = money % 50;
//		coin10 = money / 10;
//		money = money % 10;
//		coin1 = money / 1;
//		
//		System.out.println("500원: " + coin500);
//		System.out.println("100원: " + coin100);
//		System.out.println("50원: " + coin50);
//		System.out.println("10원: " + coin10);
//		System.out.println("1원: " + coin1);
		
		int coin;
		System.out.println("500원: " + (coin = money / 500));
		money -= coin * 500;
		System.out.println("100원: " + (coin = money / 100));
		money -= coin * 100;
		System.out.println("50원: " + (coin = money / 50));
		money -= coin * 50;
		System.out.println("10원: " + (coin = money / 10));
		money -= coin * 10;
		System.out.println("1원: " + (coin = money / 1));
		
	}
}

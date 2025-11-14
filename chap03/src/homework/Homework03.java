package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		int friendNum, candyNum;
		
		Scanner sc = new Scanner(System.in);
		friendNum = sc.nextInt();
		sc.nextLine();
		candyNum = sc.nextInt();
		sc.close();
		
		System.out.println("친구 수 : " + friendNum);
		System.out.println("사탕의 수 : " + candyNum);
		System.out.println("1인당 사탕 개수 : " + candyNum / friendNum);
		System.out.println("남는 사탕 개수 : " + candyNum % friendNum);
	}
}

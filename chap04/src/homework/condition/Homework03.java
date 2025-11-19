package homework.condition;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 정수 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("세 번째 정수 : ");
		num3 = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		int min;
		
		if(num1 < num2) {
			min = num1;
		}else {
			min = num2;
		}
		
		if(min > num3) {
			min = num3;
		}
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
	}
}

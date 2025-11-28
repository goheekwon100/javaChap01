package homework.homework04;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int numA = sc.nextInt();
		System.out.print("정수2: ");
		int numB = sc.nextInt();
		
		NumberController numControll = new NumberController();
		try {
			System.out.print(numA + "은(는) " + numB + "의 배수인가? " + numControll.checkDouble(numA, numB));
		} catch (NumberRangeException e) {
			e.printStackTrace();
		}
		
	}
}

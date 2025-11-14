package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String input = null;
			
			for(;;) {
				System.out.print("입력 : ");
				input = sc.nextLine();
				if (input.equals("탈출")) {
					System.out.println("프로그램 종료");
					break;
				}
				System.out.println(input);
			}
		}
		
	}
}

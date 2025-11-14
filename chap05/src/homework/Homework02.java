package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		int dan;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			dan = sc.nextInt();
			if(dan < 0) {
				System.out.println("양수만 입력해주세요.");
			}else if (dan > 9){
				System.out.println("9이하의 숫자를 입력해주세요.");
			}else if (dan == 0 ) {
				break;
			}else {
				System.out.println("=== "+ dan +"단 ===");
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
			}
		}
		sc.close();
	}
}

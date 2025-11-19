package homework.loop;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean br=true;
		
		while (br) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("양수가 아닙니다.");
			}else {
				for (int i = 1; i <= num; i++) {
					if(i%2 == 1) {
						System.out.print("박");
					}else {
						System.out.print("수");						
					}
					br = false;
				}
			}
		}
		sc.close();
	}
}


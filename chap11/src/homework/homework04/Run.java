package homework.homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String[] strArr = new String[100];
		int index=0;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("문자열: ");
				String strChar = sc.nextLine().charAt(0) + "";
				if (strChar.equalsIgnoreCase("n")) {
					break;
				} else {
					strArr[index++] = strChar;
				}
			}
		}
		System.out.println("프로그램이 종료합니다.");
		System.out.print("최종 문자열: ");
		for (int i = 0; i < index; i++) {
			System.out.print(strArr[i]);
		}
	}
}

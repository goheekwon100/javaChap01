package chap02.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		str = sc.nextLine();
		sc.close();
		
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
	}
}

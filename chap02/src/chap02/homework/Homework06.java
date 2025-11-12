package chap02.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		char num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("한 자리 숫자를 입력하세요: ");
		num = sc.nextLine().charAt(0);
		sc.close();
		
		int number = Character.getNumericValue(num);
		System.out.println("Character.getNumericValue(num): " + number);
		System.out.println("Integer.parseInt(num+\"\"): " + Integer.parseInt(num+""));
		System.out.println("num-\'0\': " + (num-'0'));
		System.out.println("num-\'0\': " + (num-((char)0)));
		System.out.println(Character.forDigit(2, number));
		
		System.out.println("입력한 숫자의 "
				+ ""
				+ " 제곱은 " + (num-'0')*(num-'0')  + "입니다.");
		
	}
}

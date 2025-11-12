package chap02.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		char unicode;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		unicode = sc.nextLine().charAt(0);
		sc.close();
		System.out.println(unicode + "의 유니코드는 : " + (int)unicode);
	}
}

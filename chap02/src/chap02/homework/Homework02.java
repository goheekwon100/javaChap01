package chap02.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		double width, height;
		double area;
		double length;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		width = sc.nextDouble();
		sc.nextLine();
		System.out.print("세로 : ");
		height = sc.nextDouble();
		sc.close();
		area = width * height;
		length = (width + height) * 2;
		
		System.out.printf("면적 : %6.2f\n",area);
		System.out.printf("면적 : %5.1f\n",length);
	}
}

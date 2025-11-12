package chap02.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		double korea,english,math;
		int totalScore;
		int averageScore;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		korea = sc.nextInt();
		System.out.print("영어 : ");
		english = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		sc.close();
		
		totalScore = (int)(korea + english + math);
		averageScore = totalScore / 3;
		
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + averageScore);
	}
}

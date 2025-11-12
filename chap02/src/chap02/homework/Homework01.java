package chap02.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		double weight, key;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("키(m) : ");
		key = sc.nextDouble();		
		sc.close();
		
		bmi = weight / (key *key );
		System.out.printf("BMI 지수 : %2.1f\n", bmi);
	}
}

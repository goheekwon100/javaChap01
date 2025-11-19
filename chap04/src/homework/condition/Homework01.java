package homework.condition;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		int age;
		String price=null;
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		sc.close();
		
		if (age < 3) {
			price = "무료";
		}else if(age >=3 && age <= 12){
			price = "10000원";
		}else if(age >=13 && age <= 18){
			price = "20000원";
		}else if(age >=19 && age <= 64){
			price = "30000원";
		}else if(age >= 65){
			price = "무료";
		}
		System.out.println("당신의 놀이동산 요금은 " + price + "입니다.");
	}
}

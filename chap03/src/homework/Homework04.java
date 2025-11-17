package homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		int korea, math, english;
		
		Scanner sc = new Scanner(System.in);
		korea = sc.nextInt();
		
		sc.nextLine();
		math = sc.nextInt();
		
		sc.nextLine();
		english = sc.nextInt();
		
		sc.nextLine();
		sc.close();
		System.out.print("국어 : " + korea);
		System.out.print("수학 : " + math);
		System.out.print("영어 : " + english);
		
		System.out.println("합계: " + (korea+math+english));
		System.out.println("평균: " + (korea+math+english)/3);
		System.out.println(korea < 60 ? "휴대폰을 바꿀 수 없습니다." : 
			math < 60 ? "휴대폰을 바꿀 수 없습니다." : 
				english < 60 ? "휴대폰을 바꿀 수 없습니다." : "휴대폰을 바꿀 수 있습니다.");
		
		//삼항 연산자 중첩금지
		int average = (korea+math+english)/3;
		boolean phoneChange = (korea > 59 && math > 59 && english > 59 && average > 59)?
			true : false;
		
		System.out.println(phoneChange ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.");
		
	}
}

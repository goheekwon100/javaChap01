package homework.condition;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		int num;
		String exercise="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		
		num = sc.nextInt();
		sc.close();
		if(num == 1) exercise = "스쿼트";
		else if(num == 2) exercise = "데드리프트";
		else if(num == 3) exercise = "벤치 프레스";
		else if(num == 4) exercise = "풀업";
		
//		if(1 <= num && num <= 4)
//			System.out.println(exercise + " 운동 시간입니다.");
//		else if(num==5){
//			System.out.println("오늘도 수고하셨습니다.");
//		}else if(num <= 0){
//			System.out.println("양수만 입력해주세요.");
//		}else{
//			System.out.println("목록에 있는 숫자만 입력해주세요.");
//		}
		//erp, Early Return Pattern
		if(num <= 0){
			System.out.println("양수만 입력해주세요.");
			return;
		}else if( num > 5){
			System.out.println("목록에 있는 숫자만 입력해주세요.");
			return;
		}else if(1 <= num && num <= 4)
			System.out.println(exercise + " 운동 시간입니다.");
		else{
			System.out.println("오늘도 수고하셨습니다.");
		}
	}
}

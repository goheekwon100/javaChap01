package homework.condition;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		int num,temperature;
		String season = "";
		String message = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		num = sc.nextInt();
		sc.nextLine();
		System.out.print("기온 : ");
		temperature = sc.nextInt();
		sc.close();
		
		if(num > 12 || num < 1) {
			season = "해당하는 계절이 없습니다.";
			return;
		}else if((num <= 2) || 12 == num) {
			season = "겨울";
			if(temperature <= -15) {
				message = "한파 경보";
			}else if(temperature <= -12 && temperature > -15){
				message = "한파 주의보"; 
			}
		}else if(num <= 5) {
			season = "봄";
		}else if(num <= 8) {
			season = "여름";
			if(temperature >= 35) {
				message = "폭염 경보";
			}else if(temperature <= 35 && temperature >= 33){
				message = "폭염 주의보"; 
			}
		}else{
			season = "가을";
		}
//		}else if((num <= 2) || 12 == num) {
//			season = "겨울";
//			if(temperature <= -15) {
//				message = "한파 경보";
//			}else if(temperature <= -12 && temperature > -15){
//				message = "한파 주의보"; 
//			}
//		}
		System.out.println(season + " " + message);
		
		
		//Early Return Pattern
		//에러나 예외 조건을 먼저 검ㅁ사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
		//장점: 1) 코드 가독성이 좋아진다.
	
	}
}

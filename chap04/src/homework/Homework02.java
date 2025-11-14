package homework;

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
		
		if(3 <= num && num <= 5) {
			season = "봄";
		}else if(6 <= num && num <= 8) {
			season = "여름";
			if(temperature >= 35) {
				message = "폭염 경보";
			}else if(temperature <= 35 && temperature >= 33){
				message = "폭염 주의보"; 
			}
		}else if(9 <= num && num <= 11) {
			season = "가을";
			
		}else if((1 <= num && num <= 2) || 12 == num) {
			season = "겨울";
			if(temperature <= -15) {
				message = "한파 경보";
			}else if(temperature <= -12 && temperature > -15){
				message = "한파 주의보"; 
			}
		}else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season + " " + message);
	
	}
}

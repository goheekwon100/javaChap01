package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		String userChoice = null;
		Scanner sc = new Scanner(System.in);
		int[] result = new int[4]; //승 무 패 결과용
		
		while(true) {
			System.out.print("가위바위보: ");
			userChoice = sc.next();
			boolean correctValueBool = false;
			if("stop".equals(userChoice)) {
				break;
			}
			for (int i = 0; i < choices.length; i++) { //올바른값 검증
				if(choices[i].equals(userChoice)) {
					correctValueBool = true;
				}
			}
			if(!correctValueBool) {
				System.out.println("가위 바위 보 몰라?");
			}else {
				int randomIndex = (int)(Math.random()*3);
				
				System.out.println(choices[randomIndex]);
				
				if(choices[randomIndex].equals(userChoice)) {
					System.out.println("비겼습니다.");
					result[2] ++;
				}else if("가위".equals(userChoice)){
					if("보".equals(choices[randomIndex])) {
						System.out.println("이겼습니다.");
						result[1] ++;
					}else {
						System.out.println("졌습니다.");
						result[3] ++;
					}
				}else if("바위".equals(userChoice)){
					if("가위".equals(choices[randomIndex])) {
						System.out.println("이겼습니다.");
						result[1] ++;
					}else {
						System.out.println("졌습니다.");
						result[3] ++;
					}
				}else if("보".equals(userChoice)){
					if("주먹".equals(choices[randomIndex])) {
						System.out.println("이겼습니다.");
						result[1] ++;
					}else {
						System.out.println("졌습니다.");
						result[3] ++;
					}
				}
			}
		}
		result[0] = result[1] + result[2] + result[3];
		System.out.print(result[0]+"전 ");
		System.out.print(result[1]+"승 ");
		System.out.print(result[2]+"무 ");
		System.out.print(result[3]+"패\n");
		
	}
}
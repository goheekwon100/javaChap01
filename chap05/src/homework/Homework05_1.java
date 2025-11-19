package homework;

import java.util.Scanner;

public class Homework05_1 {
	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		String userChoice = null;
		Scanner sc = new Scanner(System.in);
		
		int[] result = new int[4]; //승 무 패
		
		while(true) {
			rSP userIndexObj = new rSP();
			System.out.print("가위바위보: ");
			userChoice = sc.next();
			int userIndex = userIndexObj.rSP(userChoice);
			if("stop".equals(userChoice)) {
				break;
			}
			if(userIndex != -1) {
				System.out.println("가위 바위 보 몰라?");
			}else {
				int randomIndex = (int)(Math.random()*3);
				int checkPlayerWin = (randomIndex - userIndex + 3) % 3;
				if(checkPlayerWin == 2) {
					result[1] ++;
					System.out.println("이겼습니다.");
				}else if(checkPlayerWin == 1) {
					result[3] ++;
					System.out.println("졌습니다.");
				}else {
					result[2] ++;
					System.out.println("비겼습니다.");
				}
				System.out.println("사용자: " + userChoice);
				System.out.println("컴퓨터: " + choices[randomIndex]);
			}
		}
		
		result[0] = result[1] + result[2] + result[3];
		System.out.print(result[0]+"전 ");
		System.out.print(result[1]+"승 ");
		System.out.print(result[2]+"무 ");
		System.out.print(result[3]+"패\n");
	}
}
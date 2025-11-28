package homework.homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homeworkd01 {
			
		public static void main(String[] args) {
			int answer = (int)(Math.random()*50+1);
			int tryCount = 0;
			int inputNumber;
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				try {
					System.out.print("1~50 사이의 랜덤한 숫자: ");
					inputNumber = sc.nextInt();
					tryCount++;
					if (answer > inputNumber) {
						System.out.println("UP!");
					}else if(answer < inputNumber) {
						System.out.println("DOWN!");
					}else {
						System.out.println("축하합니다. 정답이에요~");
						System.out.println("시도 횟수: " + tryCount);
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
					sc.nextLine();
				}
			}
			sc.close();
			
		}
}

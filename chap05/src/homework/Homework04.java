package homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Boolean replay = false;
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			if("yes".equals(sc.next())){
				replay = true;
			}else if("no".equals(sc.next())){
				replay = false;
			}
		} while(replay);
		System.out.println("게임을 종료합니다.");
		sc.close();
	}
}

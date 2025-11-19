package homework.loop;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean repeatBreak = true;
		String str = null;
		char chr;
		char replay;
		//문자열 입력 및 문자 입력 후 문자열에서 문자 포함된 갯수 확인
		while (repeatBreak) {
			System.out.print("문자열 : ");
			str = sc.nextLine();
			System.out.print("문자 : ");
			chr = sc.nextLine().charAt(0);
			
			int chrCount=0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == chr) {
					chrCount++;
				}
			}
			System.out.println("문자: " + chrCount);
			
			//replay 여부 확인, 잘못된 값 입력시 재실행
			while(true) {
				System.out.println("다시 입력하시겠습니까? : ");
				replay = sc.nextLine().charAt(0);
				if (replay == 'N' || replay == 'n') { //'n'.equalsIgnoreCase(replay)
					repeatBreak = false;
					break;
				}else if (replay == 'Y' || replay == 'y') {
					repeatBreak = true;	
					break;
				}else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}
		sc.close();
	}
}


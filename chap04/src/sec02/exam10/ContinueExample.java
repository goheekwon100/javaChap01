package sec02.exam10;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		br: for (int i=0; i < 5; i++) {
			for (int j=0; j < 5; j++) {
				System.out.println("i: " + i + "j: " + j);
				if (j==3) {
					break br;
				}
			}
		}
		
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
		
		// Quiz
//		철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요. 
//		그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//		철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//		글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//		
//		[입력]
//		영희야 생 일 축 하 해 !
//		
//		[출력]
//		영희야생일축하해! 
//		
//		힌트: 
//		- 문자열의 길이를 얻을 때는 length()를 사용, 예: str.length()
		
		String message;
		Scanner sc = new Scanner(System.in);
		
		message = sc.nextLine();
		
		System.out.println(message.length());
		
		for(int i=0;i<message.length(); i++) {
			char test = message.charAt(i);
			if (test != ' ') {
				System.out.print(message.charAt(i));
			}
		}
		
	}
}
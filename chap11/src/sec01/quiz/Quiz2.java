package sec01.quiz;

import java.util.Scanner;

public class Quiz2 {
//	Quiz
//	원본 문자열과 삭제할 문자들을 입력 받아 실행 클래스의 deleteChar 메소드를 구현하시오.
//	deleteChar(String 원본문자열, String 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//	남는 문자열을 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//	
//	[입력]
//	1) 1,2-3 ,-!
//	2) 1a2b3 12345
//
//	[출력]
//	1) 123
//	2) ab
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] strArr = new String[2];
			String[] deleteCharArr = new String[2];
			
			String[] resultStrArr = new String[2];
			for (int i=0; i<2; i++) {
				System.out.print((i+1) + ") ");
				strArr[i] = sc.next();
				deleteCharArr[i] = sc.next();
			}
			for (int i = 0; i < 2; i++) {
				resultStrArr[i] = deleteChar(strArr[i], deleteCharArr[i]);
				System.out.println(i+1 + ") " + resultStrArr[i]);
			}
		}
	}
	
	public static String deleteChar(String str, String deleteCharStr) {
		String resultStr = "" ;
		
		A: for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			for (int j = 0; j < deleteCharStr.length(); j++) {
				char deleteChar = deleteCharStr.charAt(j);
				if (currentChar == deleteChar) {
					continue A;
				}
			}
			resultStr += currentChar;
		}
		return resultStr;
	}

}

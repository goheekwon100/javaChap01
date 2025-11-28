package sec01.quiz;

import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.
//
//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45
//
//	[출력]
//	1) 15
//	2) 15
//	3) 15	
	//charAt(i) 반복하면서 숫자만 더한다.
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] strArr = new String[3];
			for(int i=0; i<3; i++) {
				System.out.print((i+1) + ")");
				strArr[i] = sc.nextLine();
			}
			
			for (int i = 0; i < strArr.length; i++) {
				int sum=0;
				for (int j = 0; j < strArr[i].length(); j++) {
					char charInString = strArr[i].charAt(j);
					if (charInString >= '0' && charInString <= '9' ) {
						sum += charInString - '0';
					}
				}
				System.out.println(i + ") " + sum);
			}
			
		}
	}

}

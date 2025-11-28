package sec01.quiz;

import java.util.Scanner;

public class Quiz1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); // 원본 문자열
        String str2 = sc.nextLine(); // 삭제할 문자들
        System.out.println(deleteChar(str1, str2));
	}

	public static String deleteChar(String original, String toDelete) {
		String result = "";

	    for (int i = 0; i < original.length(); i++) {
	        char c = original.charAt(i);
	    		// 삭제할 문자열에 포함되어 있지 않은 경우에만 result에 추가
	        if (toDelete.indexOf(c) == -1) {
	            result += c; // 문자 하나씩 문자열에 붙이기
	        }
	    }

	    return result;
	}
}

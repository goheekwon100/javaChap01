package homework.homework05;

public class Library {
	void printMessage(String Message) {
		System.out.println(Message);
	}
	
	int sum1to100() {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	String oddOrEven(int number) {
		String result = null;
		if (number % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
	}
	
	boolean checkAlphabetInString(String str) {
		boolean result = false;
		for (int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
				result = true;
				return result;
			}else if ('a' <= str.charAt(i) && 'z' >= str.charAt(i)) {
				result = true;
				return result;
			}
		}
		return result;
	}
	
	int countCharInString(String searchStr, char targetChar) {
		int count=0;
		for (int i = 0; i < searchStr.length(); i++) {
			if (searchStr.charAt(i) == targetChar) {
				count++;
			}
		}
		return count;
	}
	
	void gugudan(int dan) {
		System.out.println(dan + "단을 출력합니다.");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
}

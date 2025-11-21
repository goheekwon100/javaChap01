package homework.homework05;

public class Run {
	public static void main(String[] args) {
		Library myLibrary = new Library();
		
		myLibrary.printMessage("안녕하세요");
		System.out.println(myLibrary.sum1to100());
		
		int number = 20;
		String result3 = myLibrary.oddOrEven(number);
		System.out.println(number +"의 홀짝 결과: " + result3);
		
		String str = "안녕하세요";
		boolean result4 = myLibrary.checkAlphabetInString(str);
		String result5 = "없다.";
		if (result4) {
			result5 = "있다.";
			System.out.println(result5);
		}
		
		String str1 = "asdjjdsijsdiajd";
		char targetChar = 'j';
		int result6 = myLibrary.countCharInString(str1, targetChar); 
		
		System.out.println(str1 + "의 문자열에 포함된 " +
				targetChar + "의 갯수는" +
				result6 + "개 입니다.");
		
		myLibrary.gugudan(1);
		
	}
}

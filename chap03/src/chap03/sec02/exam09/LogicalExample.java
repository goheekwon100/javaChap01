package chap03.sec02.exam09;

public class LogicalExample {
	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);
		
		
		
//		if ((charCode >= 'A') & (charCode <= 'Z')) {
//			System.out.println("알파벳 대문자입니다.");
//		}else if((charCode >= 'a') && (charCode <= 'z')) {
//			System.out.println("알파벳 소문자입니다.");
//		}else {
//			System.out.println("알파벳이 아닙니다.");			
//		}
		boolean upperAlphabetRangeBoolean = (charCode >= 'A') && (charCode <= 'Z');
		boolean lowerAlphabetRangeBoolean = (charCode >= 'a') && (charCode <= 'z');
		boolean noneAlphabetRangeBoolean = !(upperAlphabetRangeBoolean || lowerAlphabetRangeBoolean);
		if (upperAlphabetRangeBoolean) {
			System.out.println("알파벳 대문자입니다.");
		}else if(lowerAlphabetRangeBoolean) {
			System.out.println("알파벳 소문자입니다.");
		}else if(noneAlphabetRangeBoolean){
			System.out.println("알파벳이 아닙니다.");			
		}
	}
}

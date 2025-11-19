package homework.method.Homework03;

public class Run {
	public static void main(String[] args) {
		Library myLibrary = new Library();
		String str1 = "1234";
		String str2 = "5678";
		String str3 = new String("5678");
		
		String result1 = myLibrary.concatString(str1, str2);
		System.out.println("합친 문자열: " + result1);
		
		int result2 = myLibrary.multipleInteger(12, 23);
		System.out.println("곱셈 결과: " + result2);
		
		int result3 = myLibrary.multipleInteger(23, 12);
		System.out.println("곱셈 결과: " + result3);
		
		boolean result4 = myLibrary.equalString(str2, str3);
		System.out.println("문자열 비교: " + result4);
	}
}

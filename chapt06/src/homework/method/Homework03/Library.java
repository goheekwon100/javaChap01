package homework.method.Homework03;

public class Library {
	String concatString(String str1, String str2) {
		String result = str1 + str2;
		return result;
	}
	
	int multipleInteger(int x, int y) {
		if (x < y) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}else {
			return x * y;
		}
	}
	
	boolean equalString(String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		}else {
			return false;
		}
	}
}

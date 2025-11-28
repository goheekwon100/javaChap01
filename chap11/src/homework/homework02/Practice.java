package homework.homework02;

public class Practice {
	public static String takeState(String str) {
		String[] strArr = str.split(" ");
		
		for (String value : strArr) {
			int lastIndex = value.length();
			if(value.charAt(lastIndex-1) == '구') {
				return value;
			}
		}
		return null;
	}
}

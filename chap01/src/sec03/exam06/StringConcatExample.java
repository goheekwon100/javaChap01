package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8"; // 12 + "8" -> "128"
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8; // "102" + 8 -> "1028"
		System.out.println("str2: " + str2);

		String str3 = "10" + 2 + 8; // "102" + 8 -> "1028"
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8); // "10" + 10 -> "1010"
		System.out.println("str4: " + str4);
		
		//괄확 없어도 계산은 알아서 되겠지만
		//가독성과 유지보수를 위해 명시적으로 괄호를 쳐주는 것이 좋다.
	}

}

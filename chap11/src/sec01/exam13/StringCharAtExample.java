package sec01.exam13;

public class StringCharAtExample {
	// 주민등록번호에서 남자와 여자를 구분하기
	public static void main(String[] args) {

		String ssn = "010624-1130123";
		

		char gender = ssn.charAt(7);
		
		if ((gender-'0') % 2 == 1) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}	
		
		switch (gender) {
			case '1','3' -> System.out.println("남자입니다.");
			case '2','4' -> System.out.println("여자입니다.");
		}
	}
}

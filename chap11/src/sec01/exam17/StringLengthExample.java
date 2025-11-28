package sec01.exam17;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "9507311344444";
		
		if(ssn.length() == 13) {
			System.out.println("13자리 입력되었습니다.");
		} else {
			System.out.println("13자리 맞춰서 입력해주세요.");
		}
	}
}

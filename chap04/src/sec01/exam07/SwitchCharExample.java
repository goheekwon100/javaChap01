package sec01.exam07;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
			case 'A':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
				break;
		}
		
		//퀴즈타임 이프로 바꼬라
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("우수 회원입니다.");
		}else if(grade == 'B' || grade == 'b') {
			System.out.println("일반 회원입니다.");
		}else {
			System.out.println("손님입니다.");
		}
	}
}

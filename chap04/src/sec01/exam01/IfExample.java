package sec01.exam01;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		int score = 100;
		if (score >= 90) {
			System.out.println("점수가 90~입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else if (score < 70) {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D 입니다.");
		} else { //위에서 다 걸려져서 아래까지 내려오지도 않는다.
			System.out.println("점수가 이도저도 아닙니다.");
			System.out.println("등급은 '오류' 입니다.");
		}
		
		// (정리)
		// 1. 조건식을 여러개 작성할 수 있다.(개수 제한 없음)
		// 2. 위에서부터 차례대로 비교하고 조건식이 true가 되는 블록만 실행하고 if문을 빠져나간다.
		// 3. 필요에 따라 중첩해서 쓸 수도 있다.
		
		//Quiz 한개의 문자입력받아 대문자 소문자 숫자 기타문자 출력
		
		char letter;
		Scanner sc = new Scanner(System.in);
		
		letter = sc.nextLine().charAt(0);
		sc.close();
		
		if (letter >= 'A' && letter <= 'Z') {   
			System.out.println("대문자");
		}else if (letter >= 'a' && letter <= 'z') {
			System.out.println("소문자");
		}else if (letter >= '0' && letter <= '9') {
			System.out.println("숫자");
		}else {
			System.out.println("기타 문자");
		}
		
	}
}

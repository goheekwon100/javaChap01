package chap03.sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {
	public static void main(String[] args) {
//		int score = 85;
//		
//		char grade = (score >= 90) ? 'A' : 
//			(score >= 85) ? 'B' :
//				(score >= 80) ? 'C' :
//					(score >= 75) ? 'D' :
//						(score >= 70) ? 'E' : 'F';
//		
//		
//		System.out.println("grade는 " + grade + " 입니다.");
		
		//Quiz 0~100 입력 넘으면 오류 , 60점 이상 합격, 60점 미만 불합격, 3항연산자 이용.
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수(0~100)를 입력해주세요: ");
		score = sc.nextInt();
		sc.close();
		
		String message = !(score >=0 && score <= 100) ? "오류" :
							(score >= 60) ? "합격" :
								"불합격";
		
		System.out.println(message + "입니다.");
		
	}
}

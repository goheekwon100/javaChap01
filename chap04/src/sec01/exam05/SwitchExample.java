package sec01.exam05;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		int dice = ((int) (Math.random() * 6) + 1);// 0~1 * 5 -> 0~5 + 1 -> 1~6

		switch (dice) {
			case 1:
				System.out.println(dice + "번이 나왔습니다.");
				break;
			case 2:
				System.out.println(dice + "번이 나왔습니다.");
				break;
			case 3:
				System.out.println(dice + "번이 나왔습니다.");
				break;
			case 4:
				System.out.println(dice + "번이 나왔습니다.");
				break;
			case 5:
				System.out.println(dice + "번이 나왔습니다.");
				break;
			case 6:
				System.out.println(dice + "번이 나왔습니다.");
				break;
			default:
				System.out.println("몇번인지 모르겠습니다.");
				break;
		}

		// (정리)
		// if문: 조건식의 결과가 true/false 냐에 따라 실행
		// switch는 변수의 값에 따라 실행문을 선택해서 실행

		// Quiz 0123에 따랄 조명끄고 어두운 밝은 매우밝은 조명인지 출력, 올바른 입력이 아닙니다 디폴트

		int bulbLight;
		Scanner sc = new Scanner(System.in);

		System.out.print("조명의 밝기를 입력하세요 (0~3): ");
		bulbLight = sc.nextInt();

		switch (bulbLight) {
			case 0:
				System.out.println("조명을 끕니다.");
				break;
			case 1:
				System.out.println("어두운 조명입니다.");
				break;
			case 2:
				System.out.println("밝은 조명입니다.");
				break;
			case 3:
				System.out.println("매우 밝은 조명입니다.");
				break;
			default:
				System.out.println("올바른 입력이 아닙니다.");
				break;
		}
	}
}

package sec01.exam04;

public class IfDiceExample {
	public static void main(String[] args) {
		int dice = ((int)(Math.random() * 6) + 1);// 0~1 * 5 -> 0~5 + 1 -> 1~6
		
		// 공식화 ((int)(Math.random() * 최대값 - 최소값 + 1 ) + 최소값)
		
		System.out.println(dice + "번이 나왔습니다.");
	}
}

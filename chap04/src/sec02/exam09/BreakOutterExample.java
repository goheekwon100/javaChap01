package sec02.exam09;

public class BreakOutterExample {
	public static void main(String[] args) {
		//짝수만 출력 continue 사용
		
		for(int i=1; i<=10; i++) {
			if (i%2 == 1) {
				continue;
			}
			System.out.println("짝수: ");
		}
	}
}
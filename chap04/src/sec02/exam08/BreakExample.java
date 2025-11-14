package sec02.exam08;

public class BreakExample {
	public static void main(String[] args) {
		
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		//Quiz 1~n 까지의 합을 구하는 중 합계가 1000이 넘는 순간의 n과 n까지의 합을 출력
		
		int i = 1;
		int sum = 0;
		while (true) {
			sum += i;
			if (sum > 1000) break;
			i++;
		}
		System.out.println("1에서 " + i + "까지의 합: " + sum);
	}
}
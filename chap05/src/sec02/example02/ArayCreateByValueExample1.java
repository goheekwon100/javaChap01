package sec02.example02;

public class ArayCreateByValueExample1 {
	String[] args = new String[] { "1", "2", "3", "4", "5" }; // 이렇게는 전달 불가

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println("argument의 합: " + sum);
		
		sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

		// 이클립스에서 실행할 때 argument 주는 방법:
		// Run Configuration > Arguments

		if (args.length != 2) {
			System.out.println("값의 수가 올바르지 않습니다.");
			System.exit(0); //JVM강제 종료 코드
			//여기서 0은 정상 종료를 의미
		}
	}
}

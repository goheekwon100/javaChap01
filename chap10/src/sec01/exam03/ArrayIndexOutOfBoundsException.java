package sec01.exam03;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		// 사용자의 잘못된 사용까지 고려한 좋은 프로그래밍
		// 예외처리는 예외가 발생했을 때 어떻게 처리할지를 작성하는 것
		// 해당 코드는 예외방어코드로 예외처리는 아니다.
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: "+ data1);
			System.out.println("args1]: "+ data2);
		} else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}
	}
}

package sec02.exam04;

public class CatchOrderExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		args = new String[] {"123","45.6"};
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("매개변수 값이 부족합니다.");
			return; // 예외 발생시 method 종료
		} catch (NumberFormatException e) {
			System.out.println("숫자형식이 아니라구");
//			e.printStackTrace();
			return;
		}
		// (참고) 자바 7 이상부터 멀티캐치 구문 가능
		// 여러 예외를 | 로 연결해서 하나의 catch블록에서 처리 가능
	}
}

package sec02.exam03;

public class CatchByExceptionExample {
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
		} /*catch (Exception e) {
			System.out.println("원인 미상의 예외 발생하였습니다."); //상위 catch블록에서 모두 Exception 처리가 되므로 하위 catch블록 컴파일 에러 발생
		} */catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("매개변수 값이 부족합니다.");
			return; // 예외 발생시 method 종료
		} catch (NumberFormatException e) {
			System.out.println("숫자형식이 아니라구");
//			e.printStackTrace();
			return;
		} catch (Exception e) {
			// 모든 예외 객체는 Exception을 상속받는다. 모든 예외 객체는 Exception으로 처리 가능하다. 다형성
			System.out.println("원인 미상의 예외 발생하였습니다.");
		}
	}
}

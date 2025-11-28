package sec02.exam02;

public class TryCatchFinallyRuntimeException {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		args = new String[] {"123","456A"};
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("매개변수 값이 부족합니다.");
			return; // 예외 발생시 method 종료
		}
		
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
	}
}

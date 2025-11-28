package sec02.exam01;

public class TryCatchFinallyBlockExample {
	public static void main(String[] args) {
		// 예외 처리: 예외는 발생했지만 프로그램이 갑자기 종료되는 것을 막고 정상 실행 흐름(상태)을 유지하도록 함
		

		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("클래스를 찾았습니다.");//예외 발생시 catch로 넘어감
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //어떤 예외가 발생했는지 출력
			System.out.println("클래스가 존재하지 않습니다.");
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally는 그냥 실행되는 블록");
		}
		
		try {
			int[] arr = new int[2];
			arr[2] = 10;
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			
		}
	}
}

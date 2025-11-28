package sec02.exam05;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		try {
			findClass();
		} catch (ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
			
			//다양한 예외 출력 방법
			System.out.println(e.getMessage());
			//예외 메시지 출력(예외 객체를 만들 때 매개값으로 사용한 메시지)
//			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	// 직접 처리하지 않고 "호출한 쪽에서 다양한 방식으로 처리할 수 있도록" 예외 떠넘기기
	// 이렇게 하면 호출하는 쪽에서 더 적절한 방식으로 대응할수 있음.
	// 주로 서비스 계층에서 예외를 처리하지 않고 컨트롤러나 UI 계층에서 처리하도록 넘길 때
	// (예: 로그 남기기, 재시도, 사용자에게 알림, 특정 페이지로 이동 등)
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lan2g.String");
	}
}

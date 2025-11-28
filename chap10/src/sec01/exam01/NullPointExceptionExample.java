package sec01.exam01;

public class NullPointExceptionExample {
	public static void main(String[] args) {
//		null.equals("난"); //컴파일 예외
		String data = null;
		data = "난";
		if( data == null) {
			System.out.println("data 변수는 null이므로 비교할 수 없습니다.");
		}else {
			if(!data.equals("난")) {
				System.out.println("data는 \"난\"이 아닙니다. ");
			}else {
				System.out.println("data는 \"난\"이 맞습니다. ");
			}
		}
//		data.equals("난"); //실행 예외 발생 NPE
	}
}

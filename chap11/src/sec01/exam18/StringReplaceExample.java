package sec01.exam18;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 Programing";
		String newStr = oldStr.replace("자바", "JAVA"); //새로운 객체를 새로 생성해서 주소값 전달
		
		System.out.println(oldStr); // 기존 객체 값 유지
		System.out.println(newStr); // 새 객체 생성된 것 확인
		
		
	}
}

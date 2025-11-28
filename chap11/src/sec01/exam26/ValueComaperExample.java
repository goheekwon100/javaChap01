package sec01.exam26;

public class ValueComaperExample {
	public static void main(String[] args) {
		// Wrapper 객체 내부의 값을 비교할 때는 ==을 사용하지 않는 것이 좋음
		// 객체는 equals 또는 언박싱 후 == 비교
		
		System.out.println("[-128 ~ 127 초과 값일 경우]");
		Integer value1 = 200;
		Integer value2 = 200;
		
		System.out.println("결과 200==200: " + (value1 == value2));

		Integer value3 = 100;
		Integer value4 = 110;
		
		System.out.println("결과 " + value3 + "==" + value4 + " : " + (value3 == value4));
		// 예외적으로 -128 ~ 127 인경우 객체를 공유한다.
		System.out.println("결과 " + value3 + "==" + value4 + " : " + (value3.equals(value4)));
		
		// 굳이 예외 생각하지 말고 무조건 equals() 메소드 사용할 것 권장
	
	}
}

package sec01.exam23;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Wrapper(포장) 객체: 기본 타입의 값을 갖는 객체
		
		// 박싱(Boxing): 기본 타입의 값 -> 포장 객체
		// 1. 생성자 이용
		Integer obj1 = new Integer(1);
		System.out.println(obj1.toString());
		
		// 2. valueOf() 메소드 이용
		Integer obj2 = Integer.valueOf(1);
		Integer obj3 = Integer.valueOf("2");
		
		// 언박싱(unBoxing) : 포장 객체 -> 기본 타입의 값
		int value1 = obj1.intValue();
		
	}
}



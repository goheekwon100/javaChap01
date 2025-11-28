package sec02.exam06;

public class InstanceofExample {
	public static void main(String[] args) {
		Parent parentA = new Child();
		Parent parentB = new Parent();
		method2(parentA);
//		method2(parentB); //예외 발생, 상속관계이기 때문에 캐스팅가능성O
		method1(parentB); //instanceof 활용 예외 확인 후 캐스팅
		method0(parentB); //instanceof 활용 예외 확인 후 캐스팅(신규문법)
		method0(parentA); //instanceof 활용 예외 확인 후 캐스팅(신규문법)
	}
	
	//자바 12부터 추가된 문법
	// instanceof가 트루일 때 자동타입변환 후 변수 대입
	public static void method0(Parent parent) {
		if(parent instanceof Child child) {
			System.out.println("method1 - child로 변환 성공");
			System.out.println(child);
		}else {
			System.out.println("method1 - child로 변환 실패, 사유: 예외발생");
		}
	}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			System.out.println("method1 - child로 변환 성공");
		}else {
			System.out.println("method1 - child로 변환 실패, 사유: 예외발생");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child로 변환 성공");
	}
	
}

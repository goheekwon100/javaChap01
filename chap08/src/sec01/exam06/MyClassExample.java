package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		// Quiz: 어떤 구현 객체가 실행될지 맞춰보기
		System.out.println("1)----------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		//텔리비전 클래스 실행
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio()); 
		//오디오 클래스 객체로 넘겨서 실행
		//턴온, 셋볼륨
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		//메소드 A는 오디오 객체 생성
		//오디오 턴온 셋볼륨
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		//매개변수를 받아서 실행 
		//텔레비전 턴온 턴오프
	}

}

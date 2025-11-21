package sec05.exam04;

public class Singleton {
	// Step 2
	private static final Singleton SINGLETON = new Singleton(); // 1개의 객체만 생성, 수정불가
	
	
	// Step 1
	private Singleton() { //생성자
	}
	
	// Step 3
	public static Singleton getInstance() { //getter로 SINGLETON 주소 접근
		return SINGLETON;
	}
}

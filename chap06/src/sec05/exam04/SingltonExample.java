package sec05.exam04;

public class SingltonExample {
	public static void main(String[] args) {
//		Singleton test = new Singleton(); private로 되어있어 생성자 사용 불가
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(Singleton.getInstance());
		
		// 정리: 싱글톤은 하나의 인스턴스로 애플리케이션 전체에서 공유해야 할 때 사용하며,
		// 자원 절약과 일관성 유지가 주요 목적
	}
}

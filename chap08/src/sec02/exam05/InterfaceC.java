package sec02.exam05;

// methodA(),methodB()가 필요하면 인터페이스 상속을 통해 물려받을 수 있다.
// 

public interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
	

	default void test() {
		
	}
}

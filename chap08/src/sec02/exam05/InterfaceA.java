package sec02.exam05;

public interface InterfaceA {
	void methodA();
	
	default void test() {
		System.out.println("test");
	}
}

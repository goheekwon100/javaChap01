package sec02.exam05;

public interface InterfaceB {
	void methodB();
	
	default void test() {
		System.out.println("test212");
	}
}

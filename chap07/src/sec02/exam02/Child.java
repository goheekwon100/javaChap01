package sec02.exam02;

public class Child extends Parent{
	String playerName;
	public void method2() {
		playerName = "호랑";
		System.out.println("Child-method2() 플레이어이름: " + playerName);
	}

	public void method3() {
		System.out.println("Child-method3()");
	}
}

package sec01.exam06;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	//공통의 기능으로 재정의 불필요, 재정의 방지를 위해 final 사용
	public final void stop() { //메소드의 static 의미, 내부에서 값을 조작하지 않는 것 까지 포함
		System.out.println("차를 멈춤");
		speed = 0;
	}
}

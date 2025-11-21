package sec01.exam06;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//stop은 final메소드로 오버라이딩 할 수 없다.
//	@Override 
//	public final void stop() {
//		System.out.println("차를 멈춤");
//		speed = 0;
//	}
	
}

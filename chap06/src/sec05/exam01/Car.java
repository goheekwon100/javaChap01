package sec05.exam01;

public class Car {
	// 필드(인스턴스 필드) : 각 객체가 가지고 있는 데이터
	String model;
	int speed;
	
	//생성자
	Car(String model) {
		this.model = model;
	}
	void setSpeed(int i) {
		speed = i;
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			setSpeed(i);
			System.out.println(model + "가 달립니다.(시속:" + speed + "km/h");
		}
	}
	
	public static final int objNumber = 1111111; //정적 필드 ?
	public static void carSound () {
		System.out.println("삐용삐용");
	}
	
}

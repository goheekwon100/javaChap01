package sec04.exam05;

public class Car {
	//필드
	private int speed;
	//생성자
	
	//메소드
	public int getSpeed() { //getter
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run () {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(속도: " + speed + "km/h)");
		}
	}
	
}

//객체지향: 캡슐화, 객체에 직접 접근 방지, 세터, 게터 제공을 통해 값에 접근할 수 있음.
//잘못된 값이 들어가는 것을 세터에 로직 추가하여 미연에 방지.

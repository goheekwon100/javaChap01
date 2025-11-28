package sec03.exam01;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}

	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}

}

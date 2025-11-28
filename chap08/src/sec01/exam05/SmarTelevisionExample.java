package sec01.exam05;

public class SmarTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.search("www.naver.com");
		tv.turnOff();
		
		// 다형성을 활용할 때 객체를 어떤 인터페이스 타입에 저장할지 결정하는 기준은
		// "어떤 기능만 사용할 것인가"
		// 사용하고자 하는 기능(메소드)의 범위에 따라 선택하면 됨.
		
		
	}
}

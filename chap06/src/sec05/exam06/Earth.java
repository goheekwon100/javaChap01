package sec05.exam06;

public class Earth {
	// 불변의 진리값 상수 만들기
	// 관례적으로 모두 대문자로 작성, 단어와 단어 사이는 언더바로 연결
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA;
	
	public Earth() {
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; //final 필드로 값 수정 불가
		//static필드의 값은 class 생성시 값이 정해지기 때문에, 객체 생성시 값을 넣어주는 것은 의미가 없다.
		//static필드의 값은 생성자에서 초기화할 수 없다.
		//클래스 생성시 스태틱필드의 값은 초기화가 진행되어야함.
	}
	
	// (참고만) 선언 시 초기화를 안했을 경우 static 블록(클래스 초기화 블록)에서 초기화 가능
	// 초기화하지 않았을 경우에 작동.
	static {
		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

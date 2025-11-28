package sec03.exam01;

//추상 클래스
//미완성 설계도(미완성 메소드를 갖고 있는 클래스)
//공통 설계도(공통 특성을 모아놓은 클래스) => 즉 부모클래스로 쓰임
//공통 기능을 일부 구현 후, 하위 클래스가 나머지 구현하도록 할 때
// 예: 동물 숨쉬기(공통 처리 로직: 모든 동물은 숨을 쉰다)
// 장점: 코드 중복을 줄인다. 공통 처리 로직을 강제할 수 있음.

//보유하고 있는 메소드가 모두 완성이라고 하더라도, 객체 생성용 클래스가 아니라는 것을 명시할 때 abstract를 사용
//abstract 일때도 모든 메소드가 완성되어 있는 상태일 수 있음.
//부모로 사용하겠다는 명시, 의도 명확
abstract public class Phone {
	public String owner;
	Phone(String owner){
		this.owner = owner;
	};
	
	public abstract void turnOn();
	public abstract void turnOff();
}

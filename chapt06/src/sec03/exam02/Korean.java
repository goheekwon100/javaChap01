package sec03.exam02;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	public Korean(){
		name = "미정";
		ssn = "미정";
	}
	public Korean(String name, String ssn){
//		name = name; //양쪽 모두 매개변수를 의미함
//		ssn = ssn;
		this.name = name; //this. 을 사용하여 객체.필드로 접근해야함.
		this.ssn = ssn;
	}
	//생성자
	//메소드
}

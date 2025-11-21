package homework.homework06;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	public void changeName(String name) {
		this.memberName = name;
	}
	public void printName() {
		System.out.println(this.memberName);
	}
}

//클래스 다이어그램
//
//+ : public
//# : protected
//~ : (default)
//- : private
//
//static은 밑줄
//final은 대문자로 표현
//대문자이면서 밑줄이 있을 경우 static final 상수임을 뜻함
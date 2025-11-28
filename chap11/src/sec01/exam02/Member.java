package sec01.exam02;

public class Member extends Object{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}



	@Override
	public boolean equals(Object obj) { //Object equals 오버라이딩
		if(obj instanceof Member member) {
			if (id.equals(member.id)) { //String equals 호출
				return true;
			}
		}
		return false;
	}
	
	
}

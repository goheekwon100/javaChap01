package sec01.exam04;

public class Member extends Object{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member member) {
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// id 필드값이 같은 모든 Member 객체는 동일한 해시코드가 나오게 만들어줌
		// String 클래스 hashcode() 이용, 이미 재정의 되어 있음.
		return id.hashCode();
	}
	
}

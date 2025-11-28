package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNo == other.studentNo;
	}
	
	@Override
	public String toString() {
		return "[학번=" + studentNo + ", 이름=" + name + ", 전공=" + major + "]";
	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student student) {
//			if (name.equals(student.name) && studentNo == student.studentNo) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNo, name);
////		return studentNo + name.hashCode();
//		
////		Objects.hash(...)
//		//자바에서 여러 필드를 조합하여 간편하게 해시코드를 만들 수 잇도록 제공되는 유틸리티 메소드
//		//가변인자를 받아서 자동으로 적절한 해시코드를 계산해준다.
//	}
	
}

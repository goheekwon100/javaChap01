package sec05.exam02_2;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student("영희");
		Student st2 = new Student("철희");
//		System.out.println(st1.name); 직접 접근 불가
		st1.getName(); //getter를 통해 접근, 이유: 변수에 직접 접근하여 값 수정을 방지, 값 변경이 필요한 필드의 경우 SETTER 생성
		Student.getTotalStudents(); //내부 정적 필드를 사용하는 경우 정적 메소드 선언 가능
	}
}

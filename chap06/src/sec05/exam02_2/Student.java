package sec05.exam02_2;

public class Student {
	private static int totalStudents = 0;
	private String name; //private로 인스턴스 필드 선언시 getter필요
	
	public Student (String name) {
		this.name = name;
		totalStudents++;
	}
	
	public static void getTotalStudents() {
		System.out.println("전체 학생 수는 " + totalStudents +"명 입니다.");
//		System.out.println("전체 학생 수는 " + this.totalStudents +"명 입니다."); 사용불가
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	//인스턴스 필드나 인스턴스 메소드를 사용하는 경우 인스턴스 메소드로 선언
	//정적 필드, 정적메소드, 매개변수만 사용하는 경우 정적 메소드로 선언 가능
	//this키워드는 객체 생성시에만 사용 가능 
}

package sec01.exam02;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123452-1234111", 1);
		// 부모 생성자가 호출되고 자식 객체가 생성됨
		
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("StudNo: " + student.studentNo);
		
		String str = "문자열";
		System.out.println(str.hashCode());
		
		student.print(1); //매겨변수 유무에 따라 People Student 출력 위치 달라짐.
	}
}
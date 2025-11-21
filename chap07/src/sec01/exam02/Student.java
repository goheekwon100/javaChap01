package sec01.exam02;

public class Student extends People{
	int studentNo;
	
	public Student() {
		super();
	}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	void print(int i) {
		System.out.println("Student 출력" + i);
	}
	
}

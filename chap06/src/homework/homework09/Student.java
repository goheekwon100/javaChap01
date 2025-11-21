package homework.homework09;

public class Student {
	private static int StudentCount = 0;
	private int StudentNo;
	private String name;
	private String className;
	
	public Student () {
		StudentNo = ++StudentCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getStudentNo() {
		return StudentNo;
	}
	
}

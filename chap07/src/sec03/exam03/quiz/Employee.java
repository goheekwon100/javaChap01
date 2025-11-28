package sec03.exam03.quiz;

public abstract class Employee {
//	모든 직원은 직원 구분(type), 이름(name), 소속 부서(dept) 정보를 가지고.
	private String type;
	private String name;
	private String dept;
	public Employee(String type, String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}
	
	public abstract int getPay();
	public abstract String getInfo();

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDept() {
		return dept;
	}
	
	
}

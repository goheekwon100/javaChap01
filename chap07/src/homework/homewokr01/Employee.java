package homework.homewokr01;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	
	public Employee(String name, int age, double height, double weifht, int salary, String dept) {
		super(age, height, weifht);
		this.salary = salary;
		this.dept = dept;
		super.name = name;
	}
	public Employee() {
		super();
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
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
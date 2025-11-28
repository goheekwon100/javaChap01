package sec03.exam03.quiz;

public class FormalEmployee extends Employee{
// 직원번호(empNo), 연봉(salary)을 출력하고
	private int empNo;
	private int salary;
	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super("정규직", name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	@Override
	public int getPay() {
		return salary / 12;
	}

	@Override
	public String getInfo() {
		//정규직, 홍길동, 총무부, 1, 5000
		String result= this.getType() + ", " + this.getName() + ", " + this.getDept() + ", " + this.getEmpNo() + ", " + this.getSalary();
		//this.getType() + ", " + this.getName() + ", " + this.getDept() super.getinfo(); 로 대체 가능. 
		return result;
	}

}

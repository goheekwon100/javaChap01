package sec03.exam03.quiz;

public class InformalEmployee extends Employee {
//	기본임금(primaryPay)
	private int primaryPay;
	
	public InformalEmployee(String name, String dept, int primaryPay) {
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
	}

	public int getPrimaryPay() {
		return primaryPay;
	}

	@Override
	public int getPay() {
		return primaryPay;
	}

	@Override
	public String getInfo() {
		String result= this.getType() + ", " + this.getName() + ", " + this.getDept() + ", " + this.getPrimaryPay();
		return result;
	}
	
}

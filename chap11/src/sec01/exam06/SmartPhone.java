package sec01.exam06;

public class SmartPhone {
	public String company;
	public String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
//	@Override
//	public String toString() {
//		return "[제조사: " + company + ", OS: " + os + "]";
//	}
}

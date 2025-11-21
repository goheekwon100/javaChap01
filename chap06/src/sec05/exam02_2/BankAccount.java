package sec05.exam02_2;

public class BankAccount {
	//3개 정보 저장
	public static final double interestRate = 2.5; //금리, 정적으로 사용, private로 작성시 사용 불가 경고
	private String owner; //계좌주
	private double balance; //잔액

	//생성자
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	//메소드
	public String getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

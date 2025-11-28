package sec02.exam06.quiz;

//1) 필드: 
//	- String user: 예금주
//	- long balance: 잔액
//2) 생성자:
//	- 기본 생성자
//	- 사용자명과 초기 잔액을 받는 생성자
//3) Getter
//4) 메소드:
//	- public void deposit(int amount)
//	입금 금액만큼 잔액에 더하고 출력 예시와 같은 메시지를 출력합니다.
//	- public void withdraw(int amount)
//	출금 금액이 잔액보다 크면 InsufficientBalanceException을 발생시키고 호출한 쪽으로 예외를 떠넘깁니다.
//	출금이 성공하면 잔액에서 차감하고, 출력 예시와 같은 메시지를 출력합니다.
public class Account {
	private String user;
	private long balance;
	
	Account(){}
	Account(String user, long balance){
		this.user = user;
		this.balance = balance;
	}
	public String getUser() {
		return user;
	}
	public long getBalance() {
		return balance;
	}

//	3000원이 출금되었습니다. [잔액: 7000원]
//	5000원이 입금되었습니다. [잔액: 12000원]
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다. [잔액: " + balance + "원]");
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {

		if (balance-amount < 0) {
			throw new InsufficientBalanceException("출금 실패: " + -(balance-amount) + "원이 부족합니다.");
		}else {
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. [잔액: " + balance + "원]");
		}
	}
}

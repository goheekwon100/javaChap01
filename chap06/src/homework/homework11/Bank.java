package homework.homework11;

public class Bank {
	void transfer(Account sender, Account receiver, int amount) {
		System.out.println("계좌번호: " + sender.getAccountNumber());
		sender.withdraw(amount);
		System.out.println("현재 잔액: " + sender.getBalance());
		

		System.out.println("계좌번호: " + receiver.getAccountNumber());
		receiver.deposit(amount);
		System.out.println("현재 잔액: " + receiver.getBalance());
	}
}

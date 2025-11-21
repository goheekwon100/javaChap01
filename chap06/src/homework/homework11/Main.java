package homework.homework11;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account("123-456-789", 100000);
		Account acc2 = new Account("987-456-789", 50000);
		
		int amount = 30000;
		acc1.withdraw(amount);
		System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + acc1.getBalance() + "원");
		amount = 100000;
		acc2.deposit(amount);
		System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + acc2.getBalance() + "원");
		
		amount = 30000;
		Bank people1 = new Bank();
		people1.transfer(acc1, acc2, amount);
		
	}
}

package sec01.exam03_2;

public class PaymentExample {
	public static void main(String[] args) {
		BankTanspalPayment bankPay = new BankTanspalPayment();
		CardPayment cardPay = new CardPayment();
		PaypalPayment paypalPay = new PaypalPayment();
		
		bankPay.pay(1001011);
		cardPay.pay(10012011);
		paypalPay.pay(12300012);
	}
}
package sec02.exam03_2;

public class PaymentExample {
	public static void main(String[] args) {
		PaymentService payment[] = new PaymentService[3]; 
		payment[0] = new BankTanspalPayment();
		payment[1] = new CardPayment();
		payment[2] = new PaypalPayment();
		
		for (int i = 0; i < payment.length; i++) {
			payment[i].pay(i+1000);
		}
				
		
//		BankTanspalPayment bankPay = new BankTanspalPayment();
//		CardPayment cardPay = new CardPayment();
//		PaypalPayment paypalPay = new PaypalPayment();
//		
//		bankPay.pay(1001011);
//		cardPay.pay(10012011);
//		paypalPay.pay(12300012);
	}
}
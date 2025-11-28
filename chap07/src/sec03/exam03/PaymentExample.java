package sec03.exam03;

public class PaymentExample {
	public static void main(String[] args) {
		PaymentService payment[] = new PaymentService[3]; 
		payment[0] = new BankTanspalPayment();
		payment[1] = new CardPayment();
		payment[2] = new PaypalPayment();
		
		for (int i = 0; i < payment.length; i++) {
			payment[0].pay(i+1000);
		}
	}
}
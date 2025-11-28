package sec03.exam03;

public class CardPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("카드 결제 선택됨");
		System.out.println("카드로 : " + amount + "원 결제 완료");
	}
}

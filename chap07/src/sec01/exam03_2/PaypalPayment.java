package sec01.exam03_2;

public class PaypalPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("페이팔 결제 선택됨");
		System.out.println("페이팔로 결제 확인 중...");
		System.out.println("페이팔로 : " + amount + "원 결제 완료");
	}
}
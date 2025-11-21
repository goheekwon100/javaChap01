package sec01.exam03_2;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스: 결제 서비스의 미완성된 공통 설계도
//public abstract class PaymentService {
//	public abstract void pay(int amount);
public class PaymentService {
	public void pay(int amount) { // <- 실제로는 실행 안됨, 추상화 시키면 됨.
		System.out.println("결제 금액: " + amount + "원");
		System.out.println("결제를 처리합니다.");
	}
}

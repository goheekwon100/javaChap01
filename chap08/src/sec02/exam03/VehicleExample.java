package sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle bus = new Bus();
		
		bus.run();
//		bus.checkFare(); //요금 확인 불가
		
		((Bus)bus).checkFare(); //타입 변환 후 사용 가능.
		
		//instanceof를 활용해서 구현 관계일 때만 형변환, 예외방지
	}
}

package sec01.exam03;

public class Computer extends Calculator{
	// 자바에서 제공하는 정확한 PI값
	
//	@Override //어노테이션 사용하지 않더라도 오버라이딩(재정의)은 가능하나, 붙이는 것을 권장
	//Override 어노테이션 사용시 오버라이딩이 되었는지 확인, 제대로 되지 않을 경우 컴파일 에러 발생
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle() 실행");
		return (int)(Math.PI * r * r);
//		return super.areaCircle(10);
	}
}

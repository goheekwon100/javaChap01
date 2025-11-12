package chap03.sec02.exam08;

public class CompareOperationExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 10.0;
		System.out.println(v2 == v3);
		
//		double v4 = 0.1;
//		float v5 = 0.1f;
		
		// 정리: float타입과 double타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		// 실수 타입을 하나로 통일 권장(주로 double타입 사용0
		
		double v6 = 0.000001111111;
		System.out.println(v6);
		
		double vv1 = 0.125 * 0.125;
		double vv2 = 0.0625 * 1212126 * 2;
		double vv3 = 0.010006 * 1212126 * 2;
		
		System.out.println(1.422222222222222222222222222222222222222222222222222222222222222 == vv1 + vv2);
		
		System.out.println(vv1);
		System.out.println(vv3);
		System.out.println(vv3 == 24257.0655119);
	
}
}

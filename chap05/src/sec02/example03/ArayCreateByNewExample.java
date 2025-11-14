package sec02.example03;

public class ArayCreateByNewExample {
	public static void main(String[] args) {
		//값 목록을 이용해서 배열 생성
		//2. 배열 변수 선언 후 나중에 값 대입
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		System.out.println("총합: " + add(scores));
	}
	
	//메소드 선언
	public static int add(int[] scores) {
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}

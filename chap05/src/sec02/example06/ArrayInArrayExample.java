package sec02.example06;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		//2행3열 2차원 배열 생성 및 출력
		
//		int[][] arr1[2][3] = {{1,2,3},{4,5,6}};
		int[][] mathScore = new int[2][3];
		
		//2차원 배열의 모든 요소에 접근 하려면 중첩 for문 필요
		
		for (int i = 0; i < mathScore.length; i++) {
			//내부 for문은 열을 반복해야한다.
			for (int j = 0; j < mathScore[i].length; j++) {
				System.out.println("mathScore[" +i+"]["+j+"] : " + mathScore[i][j]);
			}
		}
		
		int[][] englishScores = new int[2][]; //값을 바로 입력하려면 크기미지정 후 {}로 구분하여 입력
		englishScores[0] = new int[] {1,2,3};
		englishScores[1] = new int[] {1,2,3};
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores[" +i+"]["+j+"] : " + englishScores[i][j]);
			}
		}
		
		
		//값 목록으로 배열 생성
		int[][] javaScores = {
			{1,2},
			{2,3,4,5}
		}; //literal 생성시 new int 생성자 생략 가능
		
		System.out.println(javaScores);
		
		
		int[][] score = new int[][] {{1,2},{2,3,4,5}};
		
		System.out.println(score);
		
	}
}

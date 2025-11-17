package sec02.example10;

public class MainStringArrayArgumentExample {
	public static void main(String[] args) {
		int[] scores = {95,71,51,51,31};
		
		int sum = 0;
		
		for (int score : scores) {
			sum += score;
			System.out.println(score);
		}
		System.out.println(sum);
		System.out.println(sum/scores.length);
	}
}

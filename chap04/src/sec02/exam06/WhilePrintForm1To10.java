package sec02.exam06;

public class WhilePrintForm1To10 {
	public static void main(String[] args) {
		int i = 1; //초기화
		while (i <= 10) { //조건식
			System.out.println(i);
			i++; //증감식
		}
		
		i = 1;
		
		do {
			System.out.println(i);
			i++; //증감식
		} while( i<=10);
	}
}

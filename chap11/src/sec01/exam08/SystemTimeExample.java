package sec01.exam08;

public class SystemTimeExample {
	public static void main(String[] args) {
		int sum = 0;
		long startTime = System.nanoTime();
		
		for(int i=0;i<1000000;i++) {
			sum += i;
		}
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime);
	}
}

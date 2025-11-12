package sec02.exam08;

public class BooleanExample {
	public static void main(String[] args) {
		//불리언, 불린
		boolean var1 = true;
		boolean var2 = false;
		
		System.out.println(var1);
		System.out.println(var2);
		
		boolean stop = true;
		
		if (stop) {
			System.out.println("stop은 "+ stop +"입니다.");
			stop = false;
			System.out.println("stop은 "+ stop +"입니다.");
		}
	}
}

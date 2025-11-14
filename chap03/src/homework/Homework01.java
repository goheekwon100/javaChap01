package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		str = sc.nextLine();
		sc.close();
		
		System.out.println((str.equals("간다")) ?  "앵무새 : 온다" : "앵무새 : 간다");
	}
}

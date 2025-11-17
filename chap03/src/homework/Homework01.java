package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		str = sc.nextLine();
		sc.close();
		
		System.out.println(("간다".equals(str)) ?  "앵무새 : 온다" : "앵무새 : 간다");
		
		//str.equals로 작성시 입력값이 null일 때 예외가 발생할 수 있다. NPE 널포인트익셉션		 
	}
}

package homework.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			System.out.print("생년월일(00000000): ");
			String dateOfBirth = sc.nextLine();
			
			String firstName = name.charAt(0) + "";
			String restName = name.substring(1);
			
			String monthDayOfBirth = dateOfBirth.substring(2,6);
			
			String secretNumber = firstName + monthDayOfBirth + restName;
			
			System.out.println("암호: " + secretNumber);
		}
	}
}

package homework.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String domain = "@goodee.co.kr";
		try (Scanner sc = new Scanner(System.in)){
			String inputUserEmail = sc.nextLine();
			inputUserEmail = inputUserEmail.trim();
			
			int atLastIndex = inputUserEmail.lastIndexOf("@");
			
			if (atLastIndex != -1) {
				String inputUserEmailDomain = inputUserEmail.substring(atLastIndex);
				if(inputUserEmailDomain.equals(domain)) {
					String id = inputUserEmail.substring(0,atLastIndex);
					System.out.println("아이디: " + id.toUpperCase());
				}
			}else {
				System.out.println("유효하지 않은 이메일입니다.");
			}
		}
		
		
	}
}

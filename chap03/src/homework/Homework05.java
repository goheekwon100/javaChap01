package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		char num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextLine().charAt(0);
		sc.close();
		
		System.out.println(num == '1' ? "입력하신 주민번호는 남성입니다." :
			num == '3' ? "입력하신 주민번호는 남성입니다." :
				num == '2' ? "입력하신 주민번호는 여자입니다." :
					num == '4' ? "입력하신 주민번호는 여자입니다." : "사람이 아닙니다.");
	}
}

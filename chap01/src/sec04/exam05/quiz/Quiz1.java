package sec04.exam05.quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		//scanner 클래스는 사용자의 입력을 다양한 ㅌ나입으로 자동변환해주는 "편리한" 기능을 제공
		Scanner sc = new Scanner(System.in);
//		var1 = sc.nextInt();
//		var2 = sc.nextInt();
//		
//		sc.close();
//		System.out.println(var1 + "," + var2);
		
		
		//주의, nextInt()나 next()는 입력 후 개행문자를 버퍼에 남김
		//따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감
		//해결법: 중간에 sc.nextLine() 을 한번 호출해서 버퍼를 정리
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine(); //해당 부분에서 나이 뒤에 입력 된 부분은 버퍼제거
		System.out.print("이름: \n");
		String name = sc.nextLine();
		sc.close(); //스캐너 사용 끝났으면 닫는걸 권장~
		
		
		System.out.println("너의 나이는 " + age);
		System.out.println("너의 이름은 " + name);
	}
}

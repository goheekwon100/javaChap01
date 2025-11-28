package homework.homework03;

import java.util.Scanner;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String inputString = sc.nextLine();
		
		CharacterController charControll = new CharacterController();
		
		try {
			System.out.println(charControll.countAlpha(inputString));
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

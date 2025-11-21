package homework.homewokr02.view;

import java.util.Scanner;

import homework.homewokr02.controller.ChocolateController;
import homework.homewokr02.controller.GreenTeaController;

public class CakeMenu {
	Scanner sc = new Scanner(System.in);
	ChocolateController cc= new ChocolateController();
	GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu (){
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크");
			System.out.println("2. 녹차 케이크");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			int selectNumber = sc.nextInt();
			
			if (selectNumber == 1) {
				chocolateMenu();
			}else if (selectNumber == 2) {
				greenTeaMenu();
			}else if (selectNumber == 9){
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
	
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		cc.bakeChocolateCake(flour, cream, cherry, chip);
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("녹차파우더(g) : ");
		double poweder = sc.nextDouble();
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
		gtc.bakeGreenTeaCake(flour, cream, poweder, cheese);
		
	}
	
}

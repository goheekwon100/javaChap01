package homework.homewokr02.controller;

import homework.homewokr02.model.Chocolate;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setChip(chip);
		System.out.println("밀가루(g) : " + c.getFlour());
		System.out.println("크림(g) : " + c.getCream());
		System.out.println("체리(개) : " + c.getCherry());
		System.out.println("초콜릿 칩(개) : " + c.getChip());
		System.out.println("치즈 케이크가 완성되었습니다.");
		return "111";
	}
}

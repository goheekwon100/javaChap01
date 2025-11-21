package homework.homewokr02.controller;

import homework.homewokr02.model.GreenTea;

public class GreenTeaController {
	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		System.out.println("밀가루(g) : " + gt.getFlour());
		System.out.println("크림(g) : " + gt.getCream());
		System.out.println("녹차파우더(g) : " + gt.getPowder());
		System.out.println("치즈 큐브(개) : " + gt.getCheese());
		System.out.println("치즈 케이크가 완성되었습니다.");
		return "111";
	}
}

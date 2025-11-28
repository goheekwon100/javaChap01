package homework.homework02;

public class Main {
	public static void main(String[] args) {
		Menu[] menuArr = new Menu[5];
		String recipe = "에스프레소 1샷";
		String ingredients = "소고기,소금,후추";
		
		for (int i = 0; i < menuArr.length; i++) {
			int randomNumber = (int)(Math.random()*10);
			if(randomNumber < 5) {
				menuArr[i] =  new Dish("스테이크",30000,ingredients);
			}else if(randomNumber >= 5) {
				menuArr[i] =  new Drink("아메리카노",5000,recipe);
			}
			menuArr[i].cook();
		}
	}
}

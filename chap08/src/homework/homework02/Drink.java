package homework.homework02;

public class Drink extends Menu {
	private String recipe;

	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}

	public Drink() {
		super();
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}


	public void cook() {
		System.out.print(toString());
		System.out.println("레시피는 " + recipe + "입니다.");
	}
	
	
}

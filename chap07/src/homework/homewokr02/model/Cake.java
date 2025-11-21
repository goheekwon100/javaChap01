package homework.homewokr02.model;

public class Cake {
	private double flour;
	private double cream;
	
	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}

	public Cake() {
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getCream() {
		return cream;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}
	
	public String toString() {
		return "test";
	}
	
}

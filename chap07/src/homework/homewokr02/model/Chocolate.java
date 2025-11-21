package homework.homewokr02.model;

public class Chocolate extends Cake {
	private int cherry;
	private int chip;
	
	
	public Chocolate(double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}


	public Chocolate() {
		super();
	}
	
	public String toString() {
		return "임시";
	}


	public int getCherry() {
		return cherry;
	}


	public void setCherry(int cherry) {
		this.cherry = cherry;
	}


	public int getChip() {
		return chip;
	}


	public void setChip(int chip) {
		this.chip = chip;
	}
	
	
}

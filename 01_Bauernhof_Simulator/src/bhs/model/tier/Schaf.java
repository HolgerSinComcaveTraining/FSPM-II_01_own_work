package bhs.model.tier;

public class Schaf extends Tier {
	private static int schafCounter = 0;
	private int scherMenge;

	/**
	 * 
	 */
	public Schaf() {
		super("Schaf " + schafCounter++);
		this.scherMenge = 4;
	}
	
	public int scheren() {
		
		int wolle = this.isErwachsen() ? scherMenge : 0;
		System.out.println("Schaf " + this + " wird geschoren und produzierte: " + wolle);
		return wolle;
	}
	
}

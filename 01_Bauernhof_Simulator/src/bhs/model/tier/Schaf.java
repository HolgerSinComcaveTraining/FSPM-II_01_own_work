package bhs.model.tier;

public class Schaf extends Tier {
	private static int schafCounter = 0;
	

	/**
	 * 
	 */
	public Schaf() {
		super("Kuh " + schafCounter++);
		
	}
	
	public int scheren() {
		System.out.println("Schaf " + this + " wird geschoren");
		return 4;
	}
	
}

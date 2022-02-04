package bhs.model.tier;

public class Kuh extends Tier {
	private static int kuhCounter = 1;
	private int melkmenge;
	

	/**
	 * 
	 */
	public Kuh() {
		super("Kuh " + kuhCounter++);
		this.melkmenge = 6;
	}
	
	public int melken() {
		int milch = this.isErwachsen() ? melkmenge : 0;
		System.out.println("Kuh " + this + " wird gemolken und produzierte: " + milch);
		return milch;
		
	}
	
	
}

package bhs.model.tier;

public class Kuh extends Tier {
	private static int kuhCounter = 0;
	

	/**
	 * 
	 */
	public Kuh() {
		super("Kuh " + kuhCounter++);
		
	}
	
	public int melken() {
		System.out.println("Kuh " + this + " wird gemolken");
		return 6;
	}
	
}

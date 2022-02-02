package bhs.model.tier;

public class Schwein extends Tier {
	private static int schweinCounter = 0;
	

	/**
	 * 
	 */
	public Schwein() {
		super("Schwein " + schweinCounter++);
		
	}
	
	public double schlachten() {
		System.out.println("Schwein " + this + " wurde  geschlachtet");
		return this.getGewicht() * Math.random()*0.25 + 0.5;
	}
	
}

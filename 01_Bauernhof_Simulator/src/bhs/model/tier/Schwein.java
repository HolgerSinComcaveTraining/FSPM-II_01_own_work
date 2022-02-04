package bhs.model.tier;

public class Schwein extends Tier {
	private static int schweinCounter = 1;
	

	/**
	 * 
	 */
	public Schwein() {
		super("Schwein " + schweinCounter++);
		
	}
	
	public double schlachten() {
		long zahl= Math.round((this.getGewicht() * (Math.random()*0.25 + 0.5)) * 1000);
		System.out.println(zahl);
		double speck = (double) zahl / 1000; 
		System.out.println("Schwein " + this + " wurde  geschlachtet und produzierte: " + speck);
		return speck;
	}
	
}

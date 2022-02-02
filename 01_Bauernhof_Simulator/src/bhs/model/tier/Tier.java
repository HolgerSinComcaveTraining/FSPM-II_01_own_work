package bhs.model.tier;

public abstract class Tier {
	private int alter;
	private double gewicht;
	private int hunger;
	private boolean erwachsen;
	private String name;
	
	/**
	 * @param alter
	 * @param gewicht
	 * @param hunger
	 * @param erwachsen
	 */
	public Tier(String name) {
		this.alter = 0;
		this.gewicht = 0;
		this.hunger = 0;
		this.erwachsen = false;
		this.name =name;
		
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public boolean isErwachsen() {
		return erwachsen;
	}

	public void setErwachsen(boolean erwachsen) {
		this.erwachsen = erwachsen;
	}
	
	
	
}

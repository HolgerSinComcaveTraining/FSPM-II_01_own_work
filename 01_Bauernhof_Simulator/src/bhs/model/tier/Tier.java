package bhs.model.tier;

public abstract class Tier {
	private int alter;
	private double gewicht;
	private int hunger;
	private boolean erwachsen;
	private String name;
	private String status;
	
	/**
	 * @param alter
	 * @param gewicht
	 * @param hunger
	 * @param erwachsen
	 */
	public Tier(String name) {
		this.alter = 0;
		this.gewicht = 5;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		
		if (this.isErwachsen()) {
			status = "/alt";
		}
		else {
			status = "/jung";
		}
		status += " /H: " + hunger;
		return status;
	}
	
	public String toString() {
		return this.getName() + " Alter: " + this.getAlter() + " Gew: " + this.getGewicht() + " " + this.getStatus();
	}
	
	
}

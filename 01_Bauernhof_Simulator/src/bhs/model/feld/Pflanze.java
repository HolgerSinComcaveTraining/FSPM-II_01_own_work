package bhs.model.feld;

import java.util.ArrayList;

public class Pflanze {

	public static final String PFLANZE_APFEL = "Apfel";
	public static final String PFLANZE_BIRNE = "Birne";
	public static final String PFLANZE_CHINAKOHL_ = "Chinakohl";
	public static final String PFLANZE_MOEHRE = "Moehre";
	public static final String PFLANZE_KARTOFFEL = "Kartoffel";
	
	//public static ArrayList<String> pflanzenSorten= new ArrayList<String>();
	
	private int quality;
	private int gewicht;
	private String pflanzenart;
	
	
	/**
	 * @param preis
	 */
	public Pflanze(String art) {
		this.pflanzenart = art;
	}
	
	
	public int getQuality() {
		return quality;
	}
	public int getGewicht() {
		return gewicht;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Pflanze [pflanzenart=" + pflanzenart + ", quality=" + quality + ", gewicht=" + gewicht + "]";
	}


	public void ernten() {
		this.quality = (int) Math.round(Math.random()*35) + 50;
		this.gewicht = 5;
		System.out.println("Pflanze geerntet: " + this);
	}
	
}

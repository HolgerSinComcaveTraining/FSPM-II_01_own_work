package bhs.model.feld;

import java.util.ArrayList;

public class Pflanze {

	public static final String PFLANZE_APFEL = "Apfel";
	public static final String PFLANZE_BIRNE = "Birne";
	public static final String PFLANZE_CHINAKOHL = "Chinakohl";
	public static final String PFLANZE_MOEHRE = "Moehre";
	public static final String PFLANZE_KARTOFFEL = "Kartoffel";
	
	
	
	public static final String[] PFLANZEN_SORTEN= {PFLANZE_APFEL, PFLANZE_BIRNE, PFLANZE_CHINAKOHL, PFLANZE_MOEHRE, PFLANZE_KARTOFFEL};
	
	private int quality;
	private int gewicht;
	private String pflanzenSorte;
	
	
	
	/**
	 * @param preis
	 */
	public Pflanze(String sorte) {
		this.pflanzenSorte = sorte;
	}
	
	
	public int getQuality() {
		return quality;
	}
	public int getGewicht() {
		return gewicht;
	}
	
	
	public String getPflanzenSorte() {
		return pflanzenSorte;
	}


	@Override
	public String toString() {
		return "Pflanze [pflanzenSorte=" + pflanzenSorte + ", quality=" + quality + ", gewicht=" + gewicht + "]";
	}


	public void ernten() {
		this.quality = (int) Math.round(Math.random()*35) + 50;
		this.gewicht = 5;
		System.out.println("Pflanze geerntet: " + this);
	}
	
}

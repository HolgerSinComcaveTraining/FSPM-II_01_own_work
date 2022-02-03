package bhs.model.feld;

public class Feld {

	private int wachstum_prozent;
	
	private Pflanze pflanze;

	/**
	 * 
	 */
	public Feld() {
		this.wachstum_prozent = 0;
	}
	
	public Pflanze getPflanze() {
		return pflanze;
	}

	public void setPflanze(Pflanze pflanze) {
		if (this.pflanze != pflanze) {
			this.wachstum_prozent = 0;
			this.pflanze = pflanze;
		}
	}

	public int getWachstum_prozent() {
		return wachstum_prozent;
	}

	public void wachsen() {
		if (wachstum_prozent <= 95) {
			wachstum_prozent += 5;
		} else {
			wachstum_prozent = 100;
		}
	}
	
	
	
}

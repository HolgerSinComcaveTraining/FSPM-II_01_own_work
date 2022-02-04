package bhs.model.feld;

public class Feld {

	private static int feldCounter = 1;
	private int wachstum_prozent;
	private String sorte;
	private int id;
	
	
	public Feld() {
		this.wachstum_prozent = 0;
		this.id = feldCounter++;
	}
	
	
		

	public int getWachstum_prozent() {
		return wachstum_prozent;
	}


	public String getSorte() {
		return sorte;
	}
	
		
	
	
	@Override
	public String toString() {
		return "Feld "+ id + ": " + wachstum_prozent + "%, Sorte=" + sorte + "]";
	}
	
	public void anbauen(String sorte) {
		if (this.sorte != sorte) {
			this.wachstum_prozent = 0;
			this.sorte = sorte;
		}
	}
	
	public void ernten() {
		System.out.println("Feld abgeerntet");
	}
	
	public void wachsen() {
		if (wachstum_prozent <= 95) {
			wachstum_prozent += 5;
		} else {
			wachstum_prozent = 100;
		}
	}




	
}

package d_21_01_2022_zad1;

import java.util.ArrayList;

public abstract class Radnik {
	
	
	protected String imeIPrezime;

	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}
	
	public abstract double plata();
	
	public void zaposliUSektor(Sektor sektor) {
		
		this.sektori.add(sektor);
		
		
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}
	
	
	
	
	


}

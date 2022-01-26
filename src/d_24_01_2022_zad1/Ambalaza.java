package d_24_01_2022_zad1;

public abstract class Ambalaza {

	protected String barKod;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;

	public Ambalaza() {

	}

	public Ambalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina) {
		this.barKod = barKod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public abstract double cenaArtikla();

	public abstract void print();

	public String getBarKod() {
		return barKod;
	}

	public void setBarKod(String barKod) {
		this.barKod = barKod;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}

	public double tezinaPakovanja() {
		return this.getBrutoTezina() - this.getNetoTezina();
	}

}

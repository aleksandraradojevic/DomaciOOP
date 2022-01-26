package d_24_01_2022_zad1;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovicaCena;

	public StaklenaAmbalaza(String barKod, String nazivArtikla, double kaucija, boolean daLiSePlacaKaucija,
			double osnovicaCena) {
		this.barKod = barKod;
		this.nazivArtikla = nazivArtikla;
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovicaCena = osnovicaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public double getOsnovicaCena() {
		return osnovicaCena;
	}

	public void setOsnovicaCena(double osnovicaCena) {
		this.osnovicaCena = osnovicaCena;
	}

	@Override
	public double cenaArtikla() {
		if (daLiSePlacaKaucija) {
			return this.getOsnovicaCena() * 1.2 + this.getKaucija();
		} else {
			return this.getOsnovicaCena() * 1.2;
		}
	}

	@Override
	public void print() {
		System.out.println("Pakovanje: Staklena Ambalaza");
		System.out.println("Bar kod: " + this.getBarKod());
		System.out.println("Naziv: " + this.getNazivArtikla());
		System.out.println("Cena osnovica: " + this.getOsnovicaCena() + " din.");
		System.out.println("Cena: " + cenaArtikla() + " din.");

	}

}

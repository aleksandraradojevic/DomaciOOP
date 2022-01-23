package d_20_01_2022_zad1;

public class Igrac extends Osoba{
	
	
	private int broj;
	private String pozicija;
	private boolean jeKapiten;
	
	
	public Igrac() {
	}
	
	public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isJeKapiten() {
		return jeKapiten;
	}

	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}
	
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj: " + this.broj);
		System.out.println("Pozicija: " + this.pozicija);
		System.out.println("Kapiten: " + this.jeKapiten);

	}


}

package d_17_01_2022_zad2;

public class Racun {



	private String brRacuna;
	private String imeIPrezime;
	private double stanjeNaRacunu;
	
	public Racun(String brRacuna, String imeIPrezime, double stanjeNaRacunu) {
		this.brRacuna = brRacuna;
		this.imeIPrezime = imeIPrezime;
		this.stanjeNaRacunu = stanjeNaRacunu;
	}
	
	public void print() {
		
		System.out.println(this.imeIPrezime + " - " + this.brRacuna);
		System.out.println("Stanje na Racunu je: " + this.stanjeNaRacunu + " rsd");
		
	}

	public void transakcija(double x) {

		if (stanjeNaRacunu - x >= 0) {
			this.stanjeNaRacunu = this.stanjeNaRacunu - x;
		} else {
			System.out.println("Nemate sredstva!");
		}

	}

	public String getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getStanjeNaRacunu() {
		return stanjeNaRacunu;
	}

}

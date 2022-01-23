package d_20_01_2022_zad1;

public class Trener extends Osoba {

//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int godineIskustva;
	private String tipTrenera;

	public Trener() {
		super();
	}

	public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godineIskutva, String tipTrenera) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.godineIskustva = godineIskutva;
		this.tipTrenera = tipTrenera;

	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void stampaj() {

		super.stampaj();
		System.out.println(this.godineIskustva + " godina iskustva");
		System.out.println(this.tipTrenera + " trener");

	}

}

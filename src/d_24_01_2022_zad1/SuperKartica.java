package d_24_01_2022_zad1;

public class SuperKartica {

	private int broj;
	private String imeIPrezime;
	private int popust;

	public SuperKartica() {

	}

	public SuperKartica(int broj, String imeIPrezime, int popust) {
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.popust = popust;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public void printKartica() {
		System.out.println("Super Kartica: " + this.getImeIPrezime() + ", broj: " + this.getBroj());
	}

}

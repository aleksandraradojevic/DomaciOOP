package d_18_01_2022_zad1;

public class Ispit {

//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	private String naziv;
	private int ocena;
	private String imeIPrezimeProfesora;

	public boolean jePolozenIspit() {

		if (this.ocena > 5) {

			return true;

		} else {
			return false;

		}
	}

	public void stampaj() {

		System.out.println(this.naziv + " - " + this.imeIPrezimeProfesora + " - " + "(" + this.ocena + ")");

	}

	public Ispit(String naziv, int ocena, String imeIPrezimeProfesora) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

}

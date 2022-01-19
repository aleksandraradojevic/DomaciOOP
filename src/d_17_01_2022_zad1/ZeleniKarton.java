package d_17_01_2022_zad1;

public class ZeleniKarton {

	private String imeIPrezimeStudenta;
	private String brIndeksa;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;

	public ZeleniKarton(String imeIPrezimeStudenta, String brIndeksa, String nazivPredmeta, String imeIPrezimeProfesora,
			int ocena) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brIndeksa = brIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public void stampaj() {

		System.out.println(this.nazivPredmeta + " - " + "(" + this.ocena + ")");
		System.out.println("Student: " + this.imeIPrezimeStudenta);
		System.out.println("Profesor: " + this.imeIPrezimeProfesora);

	}

	public boolean jePolozioIspit() {

		if (this.ocena > 5) {

			return true;

		} else {
			return false;

		}
	}

}

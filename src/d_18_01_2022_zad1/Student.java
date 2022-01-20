package d_18_01_2022_zad1;

import java.util.ArrayList;

public class Student {



	private String brIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<>();
	
	public Student(String brIndeksa, String imeIPrezime, String tipStudija) {
		this.brIndeksa = brIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}

	public void dodadjIspit(Ispit ispit) {

		this.nizIspita.add(ispit);
	}

	public double prosek() {

		double avg = 0;

		for (int i = 0; i < nizIspita.size(); i++) {

			avg = avg + this.nizIspita.get(i).getOcena();

		}

		avg = avg / nizIspita.size();
		return avg;
	}

	public void print() {

		System.out.println(this.brIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");

		for (int i = 0; i < this.nizIspita.size(); i++) {
			this.nizIspita.get(i).stampaj();
		}

		System.out.println("Prosecna ocena: " + this.prosek());
	}

}

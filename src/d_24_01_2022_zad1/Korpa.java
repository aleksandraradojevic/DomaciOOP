package d_24_01_2022_zad1;

import java.util.ArrayList;

public class Korpa {

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			if (this.ambalaze.get(i).getBarKod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}
	}

	private double cenaSaPopustom(int popust) {
		double cenaSaPopustom = 0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			cenaSaPopustom = cenaSaPopustom + this.ambalaze.get(i).cenaArtikla();
		}
		return cenaSaPopustom - (cenaSaPopustom * (popust / 100));
	}

	public double cenaSaPopustomSuperKartica(SuperKartica superKartica) {
		return cenaSaPopustom(superKartica.getPopust());
	}

	public void print() {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			this.ambalaze.get(i).print();
		}

	}

}

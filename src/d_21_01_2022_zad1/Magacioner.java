package d_21_01_2022_zad1;

import java.util.ArrayList;

public class Magacioner extends Radnik {

	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
	}

	private double prosecnaPlata() {

		double prosek = 0;

		for (int i = 0; i < this.sektori.size(); i++) {

			prosek = prosek + this.sektori.get(i).plata;

		}

		return prosek / this.sektori.size() * 0.5;

	}

	@Override
	public double plata() {

		return this.prosecnaPlata() * this.sektori.size();
	}

}

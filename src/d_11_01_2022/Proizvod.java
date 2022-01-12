package d_11_01_2022;

public class Proizvod {

	String naziv;
	double cena;
	double tezinaUGramima;

	public double racunajPostarinu() {

		double postarina;

		if (this.tezinaUGramima <= 100) {

			postarina = 200;

		} else if (this.tezinaUGramima <= 500) {

			postarina = 400;
		} else {

			postarina = 1000;
		}

		return postarina;
	}

	public double vratiCenuSaPopustom(double popust) {

		double cenaSaPopustom = this.cena * (100 - popust) / 100;

		return cenaSaPopustom;

	}

	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;

	}

	public void stampaj() {
		System.out.println(this.naziv + " ,  " + this.cena + " RSD ,  " + this.tezinaUGramima + "g ");
		

	}

}

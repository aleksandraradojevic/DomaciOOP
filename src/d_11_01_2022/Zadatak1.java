package d_11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod p1 = new Proizvod();

		p1.naziv = "Brasno";
		p1.cena = 85;
		p1.tezinaUGramima = 1000;

		
		p1.povecajCenu(20);
		p1.racunajPostarinu();
		p1.stampaj();
		System.out.println("Cena sa popustom je: " + p1.vratiCenuSaPopustom(20));
		System.out.println("Postarina iznosi: " + p1.racunajPostarinu());

		Proizvod p2 = new Proizvod();

		p2.naziv = "Secer";
		p2.cena = 50;
		p2.tezinaUGramima = 1000;


	}

}

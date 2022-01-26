package d_24_01_2022_zad1;

public class Main {

	public static void main(String[] args) {
		Ambalaza ambalaza1 = new Tetrapak("12345", "next orange", 1000, 1020, true, 100);
		Ambalaza ambalaza2 = new StaklenaAmbalaza("12389", "coca cola", 20, true, 30);

		SuperKartica sk = new SuperKartica(5005, "Pera Peric", 10);

		Korpa korpa = new Korpa();
		korpa.dodajAmbalazu(ambalaza1);
		korpa.dodajAmbalazu(ambalaza2);
		korpa.izbaciAmbalazu("12345");
		
		korpa.cenaSaPopustomSuperKartica(sk);
		
		sk.printKartica();
		System.out.println();
		korpa.print();
		

		


	}

}

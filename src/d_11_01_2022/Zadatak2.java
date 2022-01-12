package d_11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {


		
		KlimaUredjaj k1 = new KlimaUredjaj();
		
		k1.marka = "Gree";
		k1.temperatura = 18;
		k1.program = "hladjenje";
		k1.potrosnjaHladjenje = 1;
		k1.potrosnjaGrejanje = 2;
		
		k1.stampaj();
		System.out.println("Cena je: " + k1.mesecnaPotrosnja());
		
		System.out.println();
		
		KlimaUredjaj k2 = new KlimaUredjaj();
		
		k2.marka = "Samsung";
		k2.temperatura = 29;
		k2.program = "grejanje";


	}

}

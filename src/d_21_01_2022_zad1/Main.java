package d_21_01_2022_zad1;

public class Main {

	public static void main(String[] args) {
		
		Sektor prodaja = new Sektor("prodaja", 60000);
		Sektor nabavka = new Sektor("nabavka", 70000);
		Sektor proizvodnja = new Sektor("proizvodnja", 90000);

		Menadzer menadzer = new Menadzer("Pera Peric");
		
		menadzer.zaposliUSektor(nabavka);
		menadzer.zaposliUSektor(prodaja);
		
		Magacioner magacioner = new Magacioner("Zika Zikic");
		magacioner.zaposliUSektor(proizvodnja);
		magacioner.zaposliUSektor(nabavka);
		
		System.out.println("Menadzer plata: " + menadzer.plata());
		System.out.println("Magacioner plata: " + magacioner.plata());
		

	}

}

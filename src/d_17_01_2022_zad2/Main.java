package d_17_01_2022_zad2;

public class Main {

	public static void main(String[] args) {
		
		Racun racunPosiljalac = new Racun("810-1259988225-33", "Pera Peric", 10000);
		Racun racunPrimalac = new Racun("860-5588774451-12", "Zika Zikic", 2500);
		
		Transakcija transakcija = new Transakcija(125, racunPosiljalac, racunPrimalac);
		
		transakcija.izvrsiTransakciju(5000);
		
		
		transakcija.print();
		

	}

}

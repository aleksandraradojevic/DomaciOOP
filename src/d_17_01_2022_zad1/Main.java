package d_17_01_2022_zad1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<>();
		
		zeleniKartoni.add(new ZeleniKarton("Pera Peric", "12345", "Matematika 1", "Zika Zikic", 10));
		zeleniKartoni.add(new ZeleniKarton("Pera Peric", "12345", "Matematika 2", "Zika Zikic", 9));
		zeleniKartoni.add(new ZeleniKarton("Pera Peric", "12345", "Matematika 3", "Zika Zikic", 5));
		zeleniKartoni.add(new ZeleniKarton("Pera Peric", "12345", "Matematika 4", "Zika Zikic", 6));
		
		
		double prosecnaOcena = 0;
		int brojac = 0;
		
		for (int i = 0; i < zeleniKartoni.size(); i++) {
			
			zeleniKartoni.get(i).stampaj();
			System.out.println();
			
		}
		
		for (int i = 0; i < zeleniKartoni.size(); i++) {
			
			if (zeleniKartoni.get(i).jePolozioIspit()) {
				
				prosecnaOcena = prosecnaOcena + zeleniKartoni.get(i).getOcena();
				brojac ++;
				
			}
			
		}
		
		prosecnaOcena = prosecnaOcena / brojac;
		
		System.out.println("Prosecna ocena je: " + prosecnaOcena);

	}

}

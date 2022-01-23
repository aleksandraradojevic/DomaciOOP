package d_20_01_2022_zad1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Igrac igrac1 = new Igrac("Pera Peric", "1255963215478", 1990, 7, "krilo", true);
		Igrac igrac2 = new Igrac("Mika Mikic", "1885336221445", 1995, 3, "levi bek", false);
		Igrac igrac3 = new Igrac("Laza Lazic", "8855223366558", 1993, 1, "golman", false);

		Trener trener = new Trener("Zika Zikic", "7845663257852", 1981, 10, "kondicioni");

		ArrayList<Igrac> igraci = new ArrayList<>();
		
		igraci.add(igrac1);
		igraci.add(igrac2);
		igraci.add(igrac3);
		
		for (int i = 0; i < igraci.size(); i++) {
			
			igraci.get(i).stampaj();
			
		}
	}

}

package d_21_01_2022_zad1;

import java.util.ArrayList;

public class Menadzer extends Radnik{
	
	


	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
	}

	@Override
	public double plata() {
		double suma = 0;
		
		for (int i = 0; i < this.sektori.size(); i++) {
			
			suma = suma + this.sektori.get(i).plata;
			
		}
		return suma;
	}

	
	

}

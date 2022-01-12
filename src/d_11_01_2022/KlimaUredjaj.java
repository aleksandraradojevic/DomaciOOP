package d_11_01_2022;

public class KlimaUredjaj {

	String marka;
	int temperatura;
	String program;
	int potrosnjaHladjenje;
	int potrosnjaGrejanje;

	public int mesecnaPotrosnja() {
		
		int mesecnaPotrosnjaHladjenje = 30 * 15 * this.potrosnjaHladjenje;
		int mesecnaPotrosnjaGrejanje = 30 * 15 * this.potrosnjaGrejanje;
		int ukupnaPotrosnja = mesecnaPotrosnjaGrejanje + mesecnaPotrosnjaHladjenje;
		
		
		int cena;
		
		if (ukupnaPotrosnja <= 350) {
			
			cena = ukupnaPotrosnja * 6;
		} else {
			
			cena = (350 * 6) + (ukupnaPotrosnja - 350) * 9;
			
		}
		
		return cena;
		
	}


	public void stampaj() {

		System.out.println(this.marka + " - " + this.program + " - " + this.temperatura + " *C");


	}

}

package d_17_01_2022_zad2;

public class Transakcija {

	private int idTransakcije;
	private Racun racunPosiljalac;
	private Racun racunPrimalac;

	public Transakcija(int idTransakcije, Racun racunPosiljalac, Racun racunPrimalac) {
		this.idTransakcije = idTransakcije;
		this.racunPosiljalac = racunPosiljalac;
		this.racunPrimalac = racunPrimalac;
	}

	public int getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(int idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getRacunPosiljalac() {
		return racunPosiljalac;
	}

	public void setRacunPosiljalac(Racun racunPosiljalac) {
		this.racunPosiljalac = racunPosiljalac;
	}

	public Racun getRacunPrimalac() {
		return racunPrimalac;
	}

	public void setRacunPrimalac(Racun racunPrimalac) {
		this.racunPrimalac = racunPrimalac;
	}
	
	
	public void print() {
		System.out.println("Poslato sa: ");
		this.racunPosiljalac.print();
		System.out.println("Poslato na: ");
		this.racunPrimalac.print();
		
		
	}
	
	public void izvrsiTransakciju (double transakcija) {
		
	
			if (this.racunPosiljalac.getStanjeNaRacunu() - transakcija >= 0) {
				this.racunPosiljalac.transakcija(transakcija);
				this.racunPosiljalac.transakcija(izracunajProviziju(transakcija));
				this.racunPrimalac.transakcija(-transakcija);
			} else {
				
				System.out.println("Nemate sredstava!");
			}
			

	}


	private double izracunajProviziju(double transakcija) {

		if (transakcija < 4500) {

			return 45;

		} else {

			return transakcija * 0.01;
		}

	}

}

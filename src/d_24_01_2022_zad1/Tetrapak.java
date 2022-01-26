package d_24_01_2022_zad1;

public class Tetrapak extends Ambalaza{

	private boolean daLiSeReciklira;
	private double osnovicaCena;

	public Tetrapak(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza,
			double osnovnaCena) {
		super(barKod, nazivArtikla, netoTezina, brutoTezina);
		this.daLiSeReciklira = reciklaza;
		this.osnovicaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return daLiSeReciklira;
	}

	public void setReciklaza(boolean reciklaza) {
		this.daLiSeReciklira = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovicaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovicaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (daLiSeReciklira) {
			return tezinaPakovanja() * 1.5 + this.getOsnovnaCena();
		} else {
			return this.getOsnovnaCena();
		}
	}

	@Override
	public void print() {
		System.out.println("Pakovanje: Tetrapak");
		System.out.println("Bar kod: " + this.getBarKod());
		System.out.println("Bruto tezina: " + this.getBrutoTezina() + " g");
		System.out.println("Neto tezina: " + this.getNetoTezina() + " g");
		System.out.println("Naziv: " + this.getNazivArtikla());
		System.out.println("Cena osnovica: " + this.getOsnovnaCena() + " din");
		System.out.println("Cena: " + cenaArtikla() + " din");
	}

}

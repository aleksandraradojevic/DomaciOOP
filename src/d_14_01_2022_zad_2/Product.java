package d_14_01_2022_zad_2;

public class Product {

	private String code;
	private String name;
	private double pricePerKg;

	public Product(String code, String name, double pricePerKg) {
		this.code = code;
		this.name = name;
		this.pricePerKg = pricePerKg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public double getPricePerKg() {
		return this.pricePerKg;
	}

	public double getPricePerLb() {

		double priceLb = this.pricePerKg / 2.2046;
		priceLb = Math.round(priceLb * 100.00) / 100.00;
		return priceLb;
	}

	public void print() {
		System.out.println(this.code + " - " + this.name);
	}

}

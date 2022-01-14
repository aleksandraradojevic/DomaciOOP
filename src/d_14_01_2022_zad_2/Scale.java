package d_14_01_2022_zad_2;

public class Scale {

	private String unit;
	private Product product;

	public Scale() {
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void print(Product product, double weight) {
		product.print();

		if (this.unit.equals("kg")) {
			System.out.println(product.getPricePerKg() + " eur/kg x " + weight + " kg");
			System.out.print("Total: " + this.calculatePrice(weight) + " eur");
			this.calculatePrice(weight);

		} else if (this.unit.equals("lb")) {
			System.out.println(product.getPricePerLb() + " eur/lb x " + weight + " lb");
			System.out.print("Total: " + this.calculatePrice(weight) + " eur");
			this.calculatePrice(weight);

		}
		System.out.println();
	}

	public double calculatePrice(double weight) {

		double price = 0;
		if (this.unit.equals("kg")) {
			price = weight * this.product.getPricePerKg();

		} else if (this.unit.equals("lb")) {
			price = weight * this.product.getPricePerLb();
		}
		price = Math.round(price * 100.00) / 100.00;
		return price;
	}

}

package d_14_01_2022_zad_2;

public class Zadatak2 {

	public static void main(String[] args) {

		Product product = new Product("7895511-8895", "Bananas", 2);
		Scale scale1 = new Scale();
		scale1.setProduct(product);
		scale1.setUnit("kg");
		double weight1 = 1.8;
		scale1.print(product, weight1);
		System.out.println();

		Scale scale2 = new Scale();
		scale2.setProduct(product);
		scale2.setUnit("lb");
		double weight2 = 2.95;
		scale2.print(product, weight2);

	}

}

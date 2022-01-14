package d_14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Author a1 = new Author("J. K.", "Rowling");
		Book b1 = new Book("1589-88862-985", "Harry Potter and the Chamber of Secrets", 1998, a1);
		
		b1.print();
		System.out.println();
		
		Author a2 = new Author("Dobrica", "Cosic");
		Book b2 = new Book("8859-88545-125", "Vreme zla - Gresnik", 1985, a2);
		
		b2.print();
		
		

	}

}

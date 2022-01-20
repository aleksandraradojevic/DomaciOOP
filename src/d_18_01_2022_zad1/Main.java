package d_18_01_2022_zad1;

public class Main {

	public static void main(String[] args) {


		Student student = new Student("12345", "Pera Peric", "osnovne akademske studije");
		
		student.dodadjIspit(new Ispit("Fizika", 8, "Zika Zikic"));
		student.dodadjIspit(new Ispit("Matematika 1", 10, "Mika Mikic"));
		student.dodadjIspit(new Ispit("Matematika 2", 7, "Mika Mikic"));
		
		student.print();
	}

}

package d_11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost fb1 = new FacebookPost("Pera Peric", "Zika Zikic", "Hello!");

		fb1.like();
		fb1.like();
		fb1.like();
		fb1.like();
		fb1.share();
		fb1.dislike();
		fb1.share();
		
		fb1.print();
		
		FacebookPost fb2 = new FacebookPost("Mika Mikic", "Pera Peric", "Bye bye!");

		fb2.like();
		fb2.like();
		fb2.share();
		fb2.dislike();
		
		fb2.print();

	}

}

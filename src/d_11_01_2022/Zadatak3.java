package d_11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost fb1 = new FacebookPost();
		fb1.nameFrom = "Pera Peric";
		fb1.nameTo = "Mika Mikic";
		fb1.text= "Hello!";
		fb1.like = 5;
		fb1.share = 1;
		
		
		fb1.dislike();
		fb1.share();
		
		fb1.print();

	}

}

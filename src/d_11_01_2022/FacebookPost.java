package d_11_01_2022;

public class FacebookPost {

	String nameFrom;
	String nameTo;
	String text;
	int like;
	int share;

	public void like() {

		this.like++;
	}

	public void dislike() {

		if (this.like > 0) {
			this.like--;
		}
	}

	public void share() {

		this.share++;
	}

	public void print() {

		System.out.println(this.nameFrom + " >>> " + this.nameTo);
		System.out.println(this.text);
		System.out.println("Likes " + this.like + " | Shares " + this.share);

	}

}

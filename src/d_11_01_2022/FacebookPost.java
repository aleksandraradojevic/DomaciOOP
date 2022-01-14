package d_11_01_2022;

public class FacebookPost {

	public FacebookPost(String nameFrom, String nameTo, String text) {
		this.nameFrom = nameFrom;
		this.nameTo = nameTo;
		this.text = text;
	}

	public FacebookPost() {
	}

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

	public String getNameFrom() {
		return nameFrom;
	}

	public void setNameFrom(String nameFrom) {
		this.nameFrom = nameFrom;
	}

	public String getNameTo() {
		return nameTo;
	}

	public void setNameTo(String nameTo) {
		this.nameTo = nameTo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLike() {
		return like;
	}

	public int getShare() {
		return share;
	}

}

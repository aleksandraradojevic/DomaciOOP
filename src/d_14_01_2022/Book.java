package d_14_01_2022;

public class Book {
	
	
	private String isbn;
	private String title;
	private int releaseYear;
	private Author author;
	
	public Book(String isbn, String title, int releaseYear, Author author) {
		this.isbn = isbn;
		this.title = title;
		this.releaseYear = releaseYear;
		this.author = author;
	}
	
	public Book() {
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void print() {
		System.out.println(isbn);
		System.out.println(this.title + " - " + this.releaseYear);
		System.out.print("Author: ");
		author.print();
	}
	
	


}

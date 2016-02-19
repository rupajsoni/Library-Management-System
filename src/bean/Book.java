package bean;

public class Book extends Publication {

	private String edition;
	private String isbn;
	private String publisher;
	private String author_id;
	
	public Book(String lib_Id, String resource_Id, String availability,
			String title, int publish_Year, String publish_Format,
			String edition, String isbn, String publisher, String author_id) {
		super(lib_Id, resource_Id, availability, title, publish_Year,
				publish_Format);
		this.edition = edition;
		this.isbn = isbn;
		this.publisher = publisher;
		this.author_id = author_id;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	} 
	
				
}

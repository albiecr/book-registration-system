package management;

import java.util.ArrayList;
import java.util.List;

public class book {
	private List<book> registeredBooksList = new ArrayList<book>();
	private static int idCounter = 0;

	private int id;
	private String ISBN;
	private String bookName;
	private int publicationYear;
	private author authorObject;
	private publisher publisherObject;

	public List<book> getRegisteredBooksList() {
		return registeredBooksList;
	}

	public void setRegisteredBooksList(List<book> registeredBooksList) {
		this.registeredBooksList = registeredBooksList;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		book.idCounter = idCounter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public author getAuthorObject() {
		return authorObject;
	}

	public void setAuthorObject(author authorObject) {
		this.authorObject = authorObject;
	}

	public publisher getPublisherObject() {
		return publisherObject;
	}

	public void setPublisherObject(publisher publisherObject) {
		this.publisherObject = publisherObject;
	}

	public book(String ISBN, String name, int publicationYear, author authorObject, publisher publisherObject) {
		this.id = idCounter++;
		this.ISBN = ISBN;
		this.bookName = name;
		this.publicationYear = publicationYear;
		this.authorObject = authorObject;
		this.publisherObject = publisherObject;
	}

	public boolean validateISBN(String ISBN) {
		if (ISBN.length() == 13) {
			return true;
		}
		return false;
	}

	public boolean validateYear(int year) {
		if (year <= 2013) {
			return true;
		}
		return false;
	}

	public void displayBookDetails() {
		System.out.println("\nID: " + id);
		System.out.println("Book name: " + this.bookName);
		System.out.println("Book ISBN: " + this.ISBN);
		System.out.println("Publication year: " + this.publicationYear);
		System.out.println("Author name: " + authorObject.getAuthorName());
		System.out.println("Publisher name: " + publisherObject.getPublisherName());
	}

	public List<book> getBook() {
		return registeredBooksList;
	}

	public void addBook(book x) {
		registeredBooksList.add(x);
	}
}

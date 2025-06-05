package management;

import java.util.ArrayList;
import java.util.List;

public class author {

	private List<author> registeredAuthorsList = new ArrayList<author>();
	private static int authorIdCounter = 0;

	private int authorId;
	private String authorName;
	private String birthDate;
	private String CPF; // Brazilian ID, might keep as is or translate to "taxId"
	private String address;

	public List<author> getRegisteredAuthorsList() {
		return registeredAuthorsList;
	}

	public void setRegisteredAuthorsList(List<author> registeredAuthorsList) {
		this.registeredAuthorsList = registeredAuthorsList;
	}

	public static int getAuthorIdCounter() {
		return authorIdCounter;
	}

	public static void setAuthorIdCounter(int authorIdCounter) {
		author.authorIdCounter = authorIdCounter;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public author(String authorName, String birthDate, String CPF, String address) {
		this.authorId = authorIdCounter++;
		this.authorName = authorName;
		this.birthDate = birthDate;
		this.CPF = CPF;
		this.address = address;
	}

	public void displayAuthorDetails() {
		System.out.println("\nID: " + authorId);
		System.out.println("Author name: " + this.authorName);
		System.out.println("Author birth date: " + this.birthDate);
		System.out.println("Author CPF: " + this.CPF);
		System.out.println("Author address: " + this.address);
	}

	public List<author> getAuthor() {
		return registeredAuthorsList;
	}

	public void addAuthor(author y) {
		registeredAuthorsList.add(y);
	}
}

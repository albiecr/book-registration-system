package management;

import java.util.ArrayList;
import java.util.List;

public class publisher {
	private List<publisher> registeredPublishersList = new ArrayList<publisher>();
	private static int publisherIdCounter = 0;

	private int publisherId;
	private String publisherName;
	private String publisherCity;
	private String publisherCNPJ; // Could also be "companyTaxId" or "businessId"
	private String publisherAddress;
	private String publisherPhone;

	public List<publisher> getRegisteredPublishersList() {
		return registeredPublishersList;
	}

	public void setRegisteredPublishersList(List<publisher> registeredPublishersList) {
		this.registeredPublishersList = registeredPublishersList;
	}

	public static int getPublisherIdCounter() {
		return publisherIdCounter;
	}

	public static void setPublisherIdCounter(int publisherIdCounter) {
		publisher.publisherIdCounter = publisherIdCounter;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherCity() {
		return publisherCity;
	}

	public void setPublisherCity(String publisherCity) {
		this.publisherCity = publisherCity;
	}

	public String getPublisherCNPJ() {
		return publisherCNPJ;
	}

	public void setPublisherCNPJ(String publisherCNPJ) {
		this.publisherCNPJ = publisherCNPJ;
	}

	public String getPublisherAddress() {
		return publisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}

	public String getPublisherPhone() {
		return publisherPhone;
	}

	public void setPublisherPhone(String publisherPhone) {
		this.publisherPhone = publisherPhone;
	}

	public publisher(String publisherName, String publisherCity, String publisherCNPJ, String publisherAddress,
			String publisherPhone) {
		this.publisherId = publisherIdCounter++;
		this.publisherName = publisherName;
		this.publisherCity = publisherCity;
		this.publisherCNPJ = publisherCNPJ;
		this.publisherAddress = publisherAddress;
		this.publisherPhone = publisherPhone;
	}

	public void displayPublisherDetails() {
		System.out.println("\nID: " + publisherId);
		System.out.println("Publisher name: " + this.publisherName);
		System.out.println("Publisher city: " + this.publisherCity);
		System.out.println("Company CNPJ: " + this.publisherCNPJ);
		System.out.println("Publisher address: " + this.publisherAddress);
		System.out.println("Publisher phone: " + this.publisherPhone);
	}

	public List<publisher> getPublisher() {
		return registeredPublishersList;
	}

	public void addPublisher(publisher z) {
		registeredPublishersList.add(z);
	}
}

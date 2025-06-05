package management;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		book Book = new book(null, null, 0, null, null);
		author Author = new author(null, null, null, null);
		publisher Publisher = new publisher(null, null, null, null, null);

		int option;

		do {
			System.out.println(
					"=== MENU === \n1. Add information to Database \n2. List Books \n3. List Authors \n4. List Publishers \n5. Exit \n -- Choose an option! --\n");
			option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1 -> {
				System.out.println("Enter author name");
				String authorName = scanner.nextLine();

				System.out.println("Enter author birth date");
				String birthDate = scanner.nextLine();

				System.out.println("Enter author CPF");
				String CPF = scanner.nextLine();

				System.out.println("Enter author address");
				String address = scanner.nextLine();

				System.out.println("Enter publisher name");
				String publisherName = scanner.nextLine();

				System.out.println("Enter publisher city");
				String publisherCity = scanner.nextLine();

				System.out.println("Enter publisher CNPJ");
				String publisherCNPJ = scanner.nextLine();

				System.out.println("Enter publisher address");
				String publisherAddress = scanner.nextLine();

				System.out.println("Enter publisher phone");
				String publisherPhone = scanner.nextLine();

				System.out.println("Enter book ISBN");
				String ISBN = scanner.nextLine();

				if (Book.validateISBN(ISBN)) {
					System.out.println("Enter book name");
					String bookName = scanner.nextLine();

					System.out.println("Enter publication year");
					int publicationYear = scanner.nextInt();

					if (Book.validateYear(publicationYear)) {
						publisher publisherObject = new publisher(publisherName, publisherCity, publisherCNPJ,
								publisherAddress, publisherPhone);
						author authorObject = new author(authorName, birthDate, CPF, address);
						book bookObject = new book(ISBN, bookName, publicationYear, authorObject, publisherObject);
						Book.addBook(bookObject);
						Author.addAuthor(authorObject);
						Publisher.addPublisher(publisherObject);
						System.out.println("Book registered successfully!\n\n");
					} else {
						System.err.println("Year must be before 2014. Return to Main Menu\n");
					}
				} else {
					System.err.println("ISBN must contain 13 digits! Return to Main Menu\n");
				}
			}

			case 2 -> {
				System.out.println("Registered Books \n");
				for (book x : Book.getBook()) {
					x.displayBookDetails();
				}
				System.out.println("\n");
			}

			case 3 -> {
				System.out.println("Registered Authors \n");
				for (author y : Author.getAuthor()) {
					y.displayAuthorDetails();
				}
				System.out.println("\n");
			}

			case 4 -> {
				System.out.println("Registered Publishers\n");
				for (publisher z : Publisher.getPublisher()) {
					z.displayPublisherDetails();
				}
				System.out.println("\n");
			}
			}
		} while (option != 5);

		scanner.close();
	}

}

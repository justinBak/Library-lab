package library_lab;

import java.util.ArrayList;
import java.util.List;

public class Library{
	List<Book> books = new ArrayList<>(); 
	private String address;
	
	public Library(String addressTitle) {
		address = addressTitle;
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	public void printAddress() 
	{
		System.out.println(address);
	}
	
	public void rentBook(String bookTitles) {
		for(Book book : this.books) {
			if(bookTitles.equals(book.getTitle())) {
				if(book.isRented()) {
					System.out.println("Sorry, this book is already borrowed.");
					return;
				}
				else {
					book.rented();
					System.out.println("You have successfully rented" + " " + bookTitles);
					return;
				}
			}
		}
		System.out.println("Sorry, this book is not in our catalog.");
	}
	
	public void printAvailableBooks() {
		for(Book book : this.books) {
				System.out.println(book.getTitle());
		}	if(this.books.isEmpty()) {
			System.out.println("No book in catalog");
			}
		}
	
	public void returnBook(String bookTitle) {
		for(Book book : this.books) {
			if(bookTitle.equals(book.getTitle())) {
				book.returned();
				System.out.println("You have successfully returned " + bookTitle);
			}
		}
	}
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Renting The Lord of the Rings:");
        firstLibrary.rentBook("The Lord of the Rings");
        firstLibrary.rentBook("The Lord of the Rings");
        secondLibrary.rentBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }







}

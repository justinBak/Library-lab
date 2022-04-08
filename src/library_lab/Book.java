package library_lab;

public class Book{
	
    private String title;
    private boolean rented;

	public Book(String bookTitle) {
		title = bookTitle;
	}
    // Marks the book as rented
    public void rented() {
        rented = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        rented = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isRented() {
       if(rented) {
    	   return true;
       } else {
    	   return false;
       }
    }
   
    // Returns the title of the book
    public String getTitle() {
       return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Rented? (should be false): " + example.isRented());
        example.rented();
        System.out.println("Rented? (should be true): " + example.isRented());
        example.returned();
        System.out.println("Rented? (should be false): " + example.isRented());
    }
}

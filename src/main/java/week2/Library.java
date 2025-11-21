package week2;

/**
 * A simple Java program to manage library operations like adding and issuing
 * books.
 * The Library class contains methods to add a book and issue a book.
 * 
 * @author Vidhya Divakar
 *
 */
public class Library {
    public String addBook(String bookTitle) {
        System.out.println(bookTitle + " " + "Book added successfully");
        // Returning the title of the added book.
        return bookTitle;
    }

    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    // The main method to demonstrate the Library class functionality.
    public static void main(String[] args) {
        /**
         * Creating an object "bookStore" of the Library class.
         * linking the object to the methods defined in the Library class.
         * Adding a book titled "DareGlass" to the library and issuing it.
         */
        Library bookStore = new Library();
        bookStore.addBook("DareGlass");
        bookStore.issueBook();
    }

}

// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));
        library.addBook(new Book(4, "Pride and Prejudice", "Jane Austen"));

        System.out.println("\nAll Books:");
        library.displayAllBooks();

        // Linear search
        System.out.println("\nLinear Search: Looking for '1984'");
        Book foundLinear = library.linearSearchByTitle("1984");
        if (foundLinear != null) {
            foundLinear.displayBook();
        } else {
            System.out.println("Book not found.");
        }

        // Binary search
        System.out.println("\nBinary Search: Looking for 'Pride and Prejudice'");
        Book foundBinary = library.binarySearchByTitle("Pride and Prejudice");
        if (foundBinary != null) {
            foundBinary.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}

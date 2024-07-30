public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book b1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book(3, "1984", "George Orwell");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("All Books:");
        library.traverseBooks();

        System.out.println("\nLinear Search for '1984':");
        Book searchedBookLinear = library.linearSearchByTitle("1984");
        System.out.println(searchedBookLinear);

        System.out.println("\nBinary Search for '1984':");
        Book searchedBookBinary = library.binarySearchByTitle("1984");
        System.out.println(searchedBookBinary);
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add Books
        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Python Crash Course", "Eric Matthes"));

        // Add Users
        library.addUser(new User(101, "Alice"));
        library.addUser(new User(102, "Bob"));

        // Show initial state
        System.out.println("Initial Book List:");
        library.showBooks();

        // Issue and Return
        library.issueBook(1, 101);
        library.returnBook(1, 101);

        // Final state
        System.out.println("\nFinal Book List:");
        library.showBooks();
    }
}

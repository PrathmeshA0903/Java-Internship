import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null && !book.isIssued()) {
            book.issue();
            user.issueBook(book);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book issue failed.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null && book.isIssued()) {
            book.returned();
            user.returnBook(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book return failed.");
        }
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void showUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
}


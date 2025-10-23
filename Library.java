import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void showAvailableBooks() {
        System.out.println("\n📚 Available Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(" - " + book);
            }
        }
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.issueBook();
                return;
            }
        }
        System.out.println("❌ Book not found!");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("❌ Book not found!");
    }

}

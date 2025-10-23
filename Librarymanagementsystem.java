import java.util.Scanner;

public class Librarymanagementsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library library = new Library();

	        // Adding some books and users
	        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
	        library.addBook(new Book("1984", "George Orwell"));
	        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

	        library.addUser(new User("Alice", 1));
	        library.addUser(new User("Bob", 2));

	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n===== 📖 LIBRARY MANAGEMENT SYSTEM =====");
	            System.out.println("1. Show Available Books");
	            System.out.println("2. Issue Book");
	            System.out.println("3. Return Book");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    library.showAvailableBooks();
	                    break;
	                case 2:
	                    System.out.print("Enter book title to issue: ");
	                    String issueTitle = scanner.nextLine();
	                    library.issueBook(issueTitle);
	                    break;
	                case 3:
	                    System.out.print("Enter book title to return: ");
	                    String returnTitle = scanner.nextLine();
	                    library.returnBook(returnTitle);
	                    break;
	                case 4:
	                    System.out.println("👋 Exiting system... Goodbye!");
	                    break;
	                default:
	                    System.out.println("❌ Invalid choice, try again!");
	            }

	        } while (choice != 4);

	        scanner.close();
	    }

	}



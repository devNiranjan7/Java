import java.util.*;

class Book {
    private String name;
    private String author;
    private String issuedTo;
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public boolean isIssued() {
        return issuedTo != null;
    }

    public void issueBook(String user) {
        this.issuedTo = user;
        this.issuedOn = new Date();
    }

    public void returnBook() {
        this.issuedTo = null;
        this.issuedOn = null;
    }

    @Override
    public String toString() {
        return "Book: " + name + " | Author: " + author + (isIssued() ? " | Issued To: " + issuedTo + " | Issued On: " + issuedOn : " | Available");
    }
}

class Library {
    private List < Book > books = new ArrayList < > ();
    private Set < String > registeredUsers = new HashSet < > ();

    public Library(List < String > users) {
        registeredUsers.addAll(users);
    }

    public void addBook(String name, String author) {
        books.add(new Book(name, author));
        System.out.println("Book '" + name + "' added to the library.");
    }

    public void issueBook(String bookName, String userName) {
        if (!registeredUsers.contains(userName)) {
            System.out.println("User '" + userName + "' is not registered");
            return;
        }
        for (Book book: books) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                if (!book.isIssued()) {
                    book.issueBook(userName);
                    System.out.println("Book '" + bookName + "' issued to " + userName);
                } else {
                    System.out.println("Book '" + bookName + "' is already issued to " + book.getIssuedTo());
                }
                return;
            }
        }
        System.out.println("Book '" + bookName + "' not found in the library.");
    }

    public void returnBook(String bookName) {
        for (Book book: books) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book '" + bookName + "' returned successfully.");
                } else {
                    System.out.println("Book '" + bookName + "' is not currently issued.");
                }
                return;
            }
        }
        System.out.println("Book '" + bookName + "' not found in the library.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("All books in Library:");
        for (Book book: books) {
            System.out.println(book);
        }
    }
}

public class libraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList < String > users = new ArrayList < > ();
        users.add("Rahul");
        users.add("Rohit");
        users.add("Sanju");
        users.add("Surya");
        users.add("Charlie");
        Library lib = new Library(users);

        while (true) {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show all Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();

                    lib.addBook(name, author);
                    break;

                case 2:
                    System.out.print("Enter book name to issue: ");
                    String issueBook = sc.nextLine();

                    System.out.print("Enter user name: ");
                    String user = sc.nextLine();

                    lib.issueBook(issueBook, user);
                    break;

                case 3:
                    System.out.print("Enter book name: ");
                    String returnBook = sc.nextLine();

                    lib.returnBook(returnBook);
                    break;

                case 4:
                    lib.showAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting Library System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
class Library {
    String[] available, issued;
    int ac, ic;

    Library(int size) {
        available = new String[size];
        issued = new String[size];
    }

    void addBook(String name) {
        if (ac < available.length) {
            available[ac++] = name;
        } else {
            System.out.println("No space to add book!");
        }
    }

    void issueBook(String name) {
        for (int i = 0; i < ac; i++) {
            if (available[i].equalsIgnoreCase(name)) {
                issued[ic++] = name;
                for (int j = i; j < ac - 1; j++) {
                    available[j] = available[j + 1];
                }
                available[--ac] = null;
                return;
            }
        }
        System.out.println("Book not found!");

    }

    void returnBook(String name) {
        for (int i = 0; i < ic; i++) {
            if (issued[i].equalsIgnoreCase(name)) {
                available[ac++] = name;
                for (int j = i; j < ic - 1; j++) {
                    issued[j] = issued[j + 1];
                }
                issued[--ic] = null;
                return;
            }
        }
        System.out.println("This book was not Issued");

    }

    void showAvailableBook() {
        if (ac == 0) {
            System.out.println("No books available!");
        } else {
            for (int i = 0; i < ac; i++) {
                System.out.println((i + 1) + ". " + available[i]);
            }
        }
    }
}
public class libraryManager {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook("Harry Potter");
        library.addBook("Java Programming");
        library.showAvailableBook();
        library.issueBook("Java Programming");
        library.showAvailableBook();
        library.returnBook("Java Programming");
        library.showAvailableBook();
    }
}
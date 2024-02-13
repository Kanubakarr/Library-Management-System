import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        this.books = new ArrayList<>();
        initializeLibrary();
    }

    private void initializeLibrary() {
        // Adding some sample books, Magazine and Documentary to the library.
        books.add(new Book("Java Programming", "John Smith"));
        books.add(new Magazine("Science Today", "Various Authors", "Science"));
        books.add(new Book("C# 2nd Edition", "Simon Robinson"));
        books.add(new Documentary("American Symphony", "Suleika Jaouad", "2023"));


    }

    public void displayLibraryItems() {
        System.out.println("\nLibrary Items:");
        Iterator<Book> iterator = books.iterator();
        int index = 1;

        while (iterator.hasNext()) {
            Book item = iterator.next();
            System.out.println(index++ + ". " + item.getTitle());
        }
    }

    public Book getLibraryItem(int choice) {
        if (choice >= 1 && choice <= books.size()) {
            return books.get(choice - 1);
        } else {
            return null;
        }
    }
}

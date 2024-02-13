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

class Book2 {
    private String title;
    private String author;
    private boolean available;

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Student {
    private String name;
    private int id;
    private ArrayList<Book2> borrowedBooks;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<Book2>();
    }

    public void borrowBook(Book2 book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println("Book '" + book.getTitle() + "' borrowed successfully by " + name);
        } else {
            System.out.println("Sorry, the book '" + book.getTitle() + "' is not available.");
        }
    }

    public void returnBook(Book2 book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println("Book '" + book.getTitle() + "' returned successfully by " + name);
        } else {
            System.out.println("You haven't borrowed the book '" + book.getTitle() + "'.");
        }
    }
}
public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }


    public void displayInfo() {

        System.out.println("Title: " + title + ", Author: " + author);
    }

}

// Derived class - Magazine
class Magazine extends Book {
    private String category;

    public Magazine(String title, String author, String category) {
        super(title, author);
        this.category = category;
    }

    @Override
    public String toString() {
        return "Magazine: " + getTitle() + " by " + getAuthor() + ", Category: " + category;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: " + category);
    }

}
// Derived subclass Documentary
class Documentary extends Book{

    public String publishYear;

    public Documentary(String title, String author, String publishYear) {
        super(title, author);
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Documentary: " + getTitle() + " by " + getAuthor() + ", Publish: " + publishYear;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Publish: " + publishYear);
    }
}

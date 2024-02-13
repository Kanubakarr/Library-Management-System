import java.util.Scanner;

// Abubakarr kanu
public class LibrarySystem {
  public static void main(String[] args) {
    LibraryManagementSystem librarySystem = new LibraryManagementSystem();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nLibrary Management System Menu:");
      System.out.println("1. Display Library Items");
      System.out.println("2. Select a Book to Read");
      System.out.println("3. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character

      switch (choice) {
        case 1:
          librarySystem.displayLibraryItems();
          break;

        case 2:
          System.out.print("Enter the number of the book you want to read: ");
          int bookChoice = scanner.nextInt();
          scanner.nextLine(); // Consume the newline character

          Book selectedBook = librarySystem.getLibraryItem(bookChoice);
          if (selectedBook != null) {
            System.out.println("\nYou selected: ");
            selectedBook.displayInfo();
          } else {
            System.out.println("Invalid choice. Please enter a valid book number.");
          }
          break;

        case 3:
          System.out.println("Exiting Library Management System. Goodbye!");
          scanner.close();
          System.exit(0);

        default:
          System.out.println("Invalid choice. Please enter a valid option.");
      }
    }
  }
}



//        Book is the base class with attributes title and author.
//        Magazine is a derived class of Book with an additional attribute category.
//        Documentary is a subclass derived class of Book an additional attribute publishYear.
//        The LibrarySystem class demonstrates the use of arrays, lists, ArrayList, iterators, and autoboxing.
//        It creates an array of books, a list of books, and a list of integers (representing borrowed book IDs)
//        It creates an ar ray of books, a list of books, and a list of integers (representing borrowed book IDs).s
//        It uses loops and iterators to display information about books and borrowed book IDs.
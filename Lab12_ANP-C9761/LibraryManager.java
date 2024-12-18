import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Add multiple books");
            System.out.println("3. Remove a book by name");
            System.out.println("4. Remove a book by index");
            System.out.println("5. Search for a book");
            System.out.println("6. Update book details");
            System.out.println("7. Find total books");
            System.out.println("8. Sort books alphabetically");
            System.out.println("9. Display all books");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book name to add: ");
                    String book = scanner.nextLine();
                    books.add(book);
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.println("Enter book names to add (comma-separated): ");
                    String[] bookArray = scanner.nextLine().split(",");
                    ArrayList<String> bulkBooks = new ArrayList<>();
                    for (String b : bookArray) {
                        bulkBooks.add(b.trim());
                    }
                    books.addAll(bulkBooks);
                    System.out.println("Books added.");
                    break;
                case 3:
                    System.out.print("Enter book name to remove: ");
                    String removeBook = scanner.nextLine();
                    if (books.remove(removeBook)) {
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter index of book to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < books.size()) {
                        books.remove(index);
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter book name to search: ");
                    String searchBook = scanner.nextLine();
                    if (books.contains(searchBook)) {
                        System.out.println("Book is available.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter index of book to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (updateIndex >= 0 && updateIndex < books.size()) {
                        System.out.print("Enter new book name: ");
                        String newBook = scanner.nextLine();
                        books.set(updateIndex, newBook);
                        System.out.println("Book updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 7:
                    System.out.println("Total books: " + books.size());
                    break;
                case 8:
                    Collections.sort(books);
                    System.out.println("Books sorted alphabetically.");
                    break;
                case 9:
                    System.out.println("List of books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }
                    break;
                case 10:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// OUTPUT:
/*
 
Library Management System
1. Add a book
2. Add multiple books
3. Remove a book by name
4. Remove a book by index
5. Search for a book
6. Update book details
7. Find total books
8. Sort books alphabetically
9. Display all books
10. Exit
Enter your choice:

 */
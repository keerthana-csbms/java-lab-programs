//KEERTHANA G,1WN25CS108, LAB PROGRAM2
import java.util.Scanner;
class Book {
    int bookId;
    String title;
    String author;
    double price;
    static int totalBooks = 0;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    void displayInfo() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    boolean search(int id) {
        return this.bookId == id;
    }

    boolean search(String t) {
        return this.title.equalsIgnoreCase(t);
    }

    Book costlier(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }

    static int getTotalBooks() {
        return totalBooks;
    }
}

public class BookMain {
    public static void main(String[] args) {
        System.out.println("//KEERTHANA G, 1WN25CS108 : LAB PROGRAM2");
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book(101, "Java Programming", "Rama", 450.0);
        Book b2 = new Book(102, "Data Structures", "Mark ", 550.0);
        Book b3 = new Book(103, "Operating Systems", "Arvind", 600.0);

        System.out.println("Book Details:");
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();

        System.out.print("\nEnter Book ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        if (b1.search(searchId)) {
            System.out.println("Book found by ID:");
            b1.displayInfo();
        } else if (b2.search(searchId)) {
            System.out.println("Book found by ID:");
            b2.displayInfo();
        } else if (b3.search(searchId)) {
            System.out.println("Book found by ID:");
            b3.displayInfo();
        } else {
            System.out.println("No book found with ID " + searchId);
        }

        System.out.print("\nEnter Book Title to search: ");
        String searchTitle = sc.nextLine();

        if (b1.search(searchTitle)) {
            System.out.println("Book found by Title:");
            b1.displayInfo();
        } else if (b2.search(searchTitle)) {
            System.out.println("Book found by Title:");
            b2.displayInfo();
        } else if (b3.search(searchTitle)) {
            System.out.println("Book found by Title:");
            b3.displayInfo();
        } else {
            System.out.println("No book found with Title " + searchTitle);
        }

        System.out.println("\nCostlier between b1 and b2:");
        Book c1 = b1.costlier(b2);
        c1.displayInfo();

        System.out.println("Costlier between b2 and b3:");
        Book c2 = b2.costlier(b3);
        c2.displayInfo();

        System.out.println("\nTotal books created: " + Book.getTotalBooks());
    }
}
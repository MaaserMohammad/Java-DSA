package Maaser;

import java.util.ArrayList;
import java.util.Scanner;


class Book {
    String title;
    String author;
    boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

class Library{
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author){
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("book added: " + title);
    }

    public void displayBooks(){
        System.out.println("Available books in the library: ");
        for (Book book : books){
            if (!book.isIssued){
                System.out.println("Title: " + ", Author: " +book.author);
            }
        }
    }

    public void issueBook(String title){
        for (Book book : books) {
            if(book.title.equalsIgnoreCase(title) && !book.isIssued) {
                book.isIssued = true;
                System.out.println("book issued: " + book.title);
                return;
            }
        }
        System.out.println("Book is not Available or already issued. ");
    }

    public void returnBook(String title) {
        for (Book book: books) {
            if(book.title.equalsIgnoreCase(title) && book.isIssued) {
                book.isIssued = false;
                System.out.println("Book returned: " +book.title);
                return;
            }
        }
        System.out.println("Invalid book return attempt.");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System.");
            System.out.println("1. Add a Book");
            System.out.println("2. Display the Available Books");
            System.out.println("3. Issue the Book");
            System.out.println("4. Return the Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Enter the book title: ");
                    String title = in.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = in.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter the book title to issue: ");
                    String issueTitle = in.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 4:
                    System.out.print("Enter the book title to return: ");
                    String returnTitle = in.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the Library Management System...Finally Exit.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

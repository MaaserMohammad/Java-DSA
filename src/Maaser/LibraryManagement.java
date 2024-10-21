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
        System.out.println("Book not Available or already isssued. ");
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

    }
}

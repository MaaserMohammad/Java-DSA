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
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;

    }
}
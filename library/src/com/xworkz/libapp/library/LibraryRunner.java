package com.xworkz.libapp.library;

import com.xworkz.libapp.book.Book;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of book to be added");
        int size = scanner.nextInt();
        Library library = new Library(size);
        for (int i = 0; i < size; i++) {
            Book book = new Book();
            System.out.println("Enter the name of the Book");
            book.setBookName(scanner.next());
            System.out.println("Enter author of the book");
            book.setAuthorName(scanner.next());
            System.out.println("Enter the price of the book");
            book.setPrice(scanner.nextDouble());
            System.out.println("Enter the language of the book");
            book.setLanguage(scanner.next());
        }
        String input = null;
        do {
            System.out.println("Enter 1 to get book info");
            System.out.println("Enter 2 to update book Price");
            System.out.println("Enter 3 to update author Name");
            System.out.println("Enter 4 to update Language");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    library.getBookName();
                    break;
                case 2:
                    System.out.println("Enter the price to be updated");
                    double amt = scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Enter author name to be updated");
                    String name = scanner.next();
                    break;
                case 4:
                    System.out.println("Enter Language to be updated");
                    String lang = scanner.next();
                    break;
                default:
                    System.out.println("Please provide valid options");
            }
            System.out.println("do you want to continue yes/no");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes"));
        System.out.println("thank you for your time");

    }
}

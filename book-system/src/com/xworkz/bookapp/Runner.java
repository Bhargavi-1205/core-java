package com.xworkz.bookapp;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("The book Id is ");
        int bookId = scanner.nextInt();
        book.setBookId(bookId);
        System.out.println("The book name is ");
        String bookName = scanner.nextLine();
        scanner.nextLine();
        book.setBookName(bookName);
        System.out.println("The author of book is");
        String bookAuthor = scanner.next();
        book.setBookAuthor(bookAuthor);
        System.out.println("The book price is ");
        double bookPrice = scanner.nextDouble();
        book.setBookPrice(bookPrice);
        System.out.println(book);
    }
}

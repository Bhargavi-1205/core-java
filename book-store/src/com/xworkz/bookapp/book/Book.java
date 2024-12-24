package com.xworkz.bookapp.book;

public final class Book implements Cloneable {
   private final int bookId = 1;
   private final String bookName = "To good to be true";
    private final String bookAuthor = "Thomas";
    private final  double bookPrice = 120.0;


    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public double getBookPrice() {
        return bookPrice;
    }
//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", bookName='" + bookName + '\'' +
//                ", bookAuthor='" + bookAuthor + '\'' +
//                ", bookPrice=" + bookPrice +
//                '}';
//    }
}


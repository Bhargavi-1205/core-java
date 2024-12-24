package com.xworkz.bookapp;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private double bookPrice;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
    public double getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}

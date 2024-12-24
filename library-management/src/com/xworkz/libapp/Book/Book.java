package com.xworkz.libapp.Book;


public class Book implements Cloneable {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublication;

    public Book(){
        System.out.println("Book cons is invoked");
    }

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

    public void setBookPublication(String bookPublication) {
        this.bookPublication = bookPublication;
    }

    public String getBookPublication() {
        return bookPublication;
    }
    @Override
    public int hashCode(){
        return this.bookId;
    }
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.bookId == book.bookId && this.bookName == book.bookName && this.bookAuthor == book.bookAuthor && this.bookPublication == book.bookPublication)
            return true;
        return false;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

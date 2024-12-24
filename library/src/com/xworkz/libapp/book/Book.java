package com.xworkz.libapp.book;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Book {
    private int bookId;
    private String bookName;
    private double price;
    private String authorName;
    private String language;

    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

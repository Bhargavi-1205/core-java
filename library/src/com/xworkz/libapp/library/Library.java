package com.xworkz.libapp.library;

import com.xworkz.libapp.book.Book;
import com.xworkz.libapp.exception.AuthorNameNotFoundException;
import com.xworkz.libapp.exception.IdNotFoundException;
import com.xworkz.libapp.exception.LanguageNotFoundException;

public class Library {

    Book book[] = null;
    public Library(int size){
    book = new Book[size];
    }
    int  index;

    public boolean addBook(Book book){
        boolean isAdded = false;
        if(book != null){
            if(book.getBookName() != null){
                this.book[index++] = book;
                isAdded = true;
            }
        }
        return  isAdded;
    }
    public void getBookName(){
        System.out.println("book Info");
        for(Book book : book){
            if(book != null){
                System.out.println(book);
            }
        }
    }
    public boolean updateBookPriceById(double updatePrice, int id){
        boolean isPriceUpdated = false;
        try {
            for (Book book1 : book) {
                if (book1.getBookId() == id) {
                    book1.setPrice(updatePrice);
                    isPriceUpdated = true;
                }
            }
            if (isPriceUpdated = false) {
                System.out.println(id + "not found");
            }
        }catch (IdNotFoundException e){
            e.printStackTrace();
        }
        return isPriceUpdated;
    }
    public boolean updateBookNameByAuthorName(String bookName ,String authorName){
        boolean isBookNameUpdated = false;
        try {
            for (Book ref : book) {
                if (ref.getAuthorName() == authorName) {
                    ref.setBookName(bookName);
                    isBookNameUpdated = true;
                }
            }
            if (isBookNameUpdated = false) {
                System.out.println(authorName + "not found");
            }
        }catch (AuthorNameNotFoundException e){
            e.printStackTrace();
        }
        return isBookNameUpdated;
    }
    public boolean updateBookNameByLanguage(String bookName , String language){
        boolean isBookNameUpadate =  false;
        try {
            for (Book book2 : book) {
                if (book2.getLanguage() == language) {
                    book2.setBookName(bookName);
                    isBookNameUpadate = true;
                }

            }
            if (isBookNameUpadate = false) {
                System.out.println(language + "not found");
            }

        }catch (LanguageNotFoundException e){
            e.printStackTrace();
        }
        return isBookNameUpadate;
        }
}

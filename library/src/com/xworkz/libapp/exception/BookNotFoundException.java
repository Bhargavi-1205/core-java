package com.xworkz.libapp.exception;

public class BookNotFoundException  extends RuntimeException{

    public BookNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

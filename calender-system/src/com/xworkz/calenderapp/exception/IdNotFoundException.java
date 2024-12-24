package com.xworkz.calenderapp.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

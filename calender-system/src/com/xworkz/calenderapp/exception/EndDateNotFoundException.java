package com.xworkz.calenderapp.exception;

import org.omg.SendingContext.RunTime;

public class EndDateNotFoundException  extends RuntimeException {
    public EndDateNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

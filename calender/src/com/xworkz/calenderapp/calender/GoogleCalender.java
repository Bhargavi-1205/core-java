package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.event.Event;

import java.util.Calendar;

public class GoogleCalender implements Calendar {
    Event event = null;
    int index;

    public boolean addEvent(Event event) {
        System.out.println("addEvent started");
        boolean isAdded = false;
        if(index <this.event.length){
        if (event.getEventId() != 0) {
            this.event[index++] = event;
            isAdded = true;
        }
        return isAdded;
    }
    public boolean getEventId(){

    }

}

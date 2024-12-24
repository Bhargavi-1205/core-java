package com.xworkz.calenderapp.calender;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.event.EventType;
import com.xworkz.calenderapp.exception.DescriptionNotFoundException;
import com.xworkz.calenderapp.exception.EndDateNotFoundException;
import com.xworkz.calenderapp.exception.IdNotFoundException;
import com.xworkz.calenderapp.exception.WhoNotFoundException;

public class GoogleCalender implements Calender {
    Event event[] = null;

    public GoogleCalender(int size) {
        event = new Event[size];
    }

    int index;

    public boolean addEvent(Event event) {
        if (index < this.event.length) {
            if (event.getEventId() > 0 && event.getWho() != null) {
                this.event[index++] = event;
                System.out.println("Event added succesfully");
                return true;
            } else {
                System.out.println("Invalid event details");
                return false;
            }
        } else {
            System.out.println("ArrayIndexOutOfBoundsException : Event array is full");
            return false;
        }
    }
    public void getDetails(){
        System.out.println("Event Info: ");
        for (Event eventRef : event){
            if(eventRef != null){
                System.out.println(eventRef);
            }else{
                System.out.println("No availability");
            }
        }
    }
    public Event getEventById(int eventId){

            System.out.println("getEventBy Id method started");
            Event isIdFound = null;
            try{
            for (Event eventRef : event) {
                if (eventRef != null && eventRef.getEventId() == eventId) {
                    System.out.println("Event found");
                    System.out.println("EventId: " + eventRef.getEventId());
                    System.out.println("EventType: " + eventRef.getWho());
                    System.out.println("who: " + eventRef.getStartDate());
                    System.out.println("EventStartDate: " + eventRef.getStartDate());
                    System.out.println("EventEndDate: " + eventRef.getEndDate());
                    System.out.println("All day Event : " + eventRef.isAllDayEvent());
                    System.out.println("Description: " + eventRef.getDescription());
                }
            }
            System.out.println("getEventById method ended");
            System.out.println("********");
        }catch (IdNotFoundException e){
            e.printStackTrace();
        }
        return isIdFound;
    }
    public Event getEventByWho(String who){
        System.out.println("Get Event By who started");
        Event byWho = null;
        try {
            for (Event eventRef : event) {
                if (eventRef != null && eventRef.getWho() == who) {
                    System.out.println("Event who found");
                    System.out.println("EventId: " + eventRef.getEventId());
                    System.out.println("EventType: " + eventRef.getWho());
                    System.out.println("who: " + eventRef.getStartDate());
                    System.out.println("EventStartDate: " + eventRef.getStartDate());
                    System.out.println("EventEndDate: " + eventRef.getEndDate());
                    System.out.println("All day Event : " + eventRef.isAllDayEvent());
                    System.out.println("Description: " + eventRef.getDescription());
                }
            }
            System.out.println("get Event By who ended");
            System.out.println("*****");
        }catch (WhoNotFoundException w){
            w.printStackTrace();
        }
        return byWho;
    }
    public Event getEventByStartDate(String startDate){
        System.out.println("Get Event By startDate ");
        Event byStartDate = null;
        for(Event eventRef : event){
            if(eventRef != null && eventRef.getStartDate() == startDate){
                System.out.println("Event startDate found");
                System.out.println("EventId: "+eventRef.getEventId());
                System.out.println("EventType: "+eventRef.getWho());
                System.out.println("who: "+eventRef.getStartDate());
                System.out.println("EventStartDate: "+eventRef.getStartDate());
                System.out.println("EventEndDate: "+eventRef.getEndDate());
                System.out.println("All day Event : "+eventRef.isAllDayEvent());
                System.out.println("Description: "+eventRef.getDescription());
            }
        }
        System.out.println("get Event By startDate ended");
        System.out.println("******");
        return byStartDate;
    }
    public Event getEventByEndDate(String endDate){
        System.out.println("Get Event By EndDate ");
        Event byEndDate = null;
        for(Event eventRef : event){
            if(eventRef != null && eventRef.getEndDate() == endDate){
                System.out.println("Event endDate found ");
                System.out.println("EventId: "+eventRef.getEventId());
                System.out.println("EventType: "+eventRef.getWho());
                System.out.println("who: "+eventRef.getStartDate());
                System.out.println("EventStartDate: "+eventRef.getStartDate());
                System.out.println("EventEndDate: "+eventRef.getEndDate());
                System.out.println("All day Event : "+eventRef.isAllDayEvent());
                System.out.println("Description: "+eventRef.getDescription());
            }
        }
        System.out.println("get Event By endDate ended ");
        System.out.println("******");
        return byEndDate;
    }
    public Event getEventByDescription(String description){
        System.out.println("Get event by description ");
        Event byDescription = null;
        for(Event eventRef : event ){
            if(eventRef != null && eventRef.getDescription() == description){
                System.out.println("Event Description found");
                System.out.println("EventId: "+eventRef.getEventId());
                System.out.println("EventType: "+eventRef.getWho());
                System.out.println("who: "+eventRef.getStartDate());
                System.out.println("EventStartDate: "+eventRef.getStartDate());
                System.out.println("EventEndDate: "+eventRef.getEndDate());
                System.out.println("All day Event : "+eventRef.isAllDayEvent());
                System.out.println("Description: "+eventRef.getDescription());
            }
        }
        System.out.println("get Event By description");
        System.out.println("*****");
        return byDescription;
    }
    public Event getEventByAllDayEvent(boolean isAllDayEvent){
        System.out.println("Get event by alldayEvent ");
        Event byAllDayEvent = null;
        for(Event eventRef : event ){
            if(eventRef != null && eventRef.isAllDayEvent() == isAllDayEvent){
                System.out.println("isAllDayEvent found");
                System.out.println("EventId: "+eventRef.getEventId());
                System.out.println("EventType: "+eventRef.getWho());
                System.out.println("who: "+eventRef.getStartDate());
                System.out.println("EventStartDate: "+eventRef.getStartDate());
                System.out.println("EventEndDate: "+eventRef.getEndDate());
                System.out.println("All day Event : "+eventRef.isAllDayEvent());
                System.out.println("Description: "+eventRef.getDescription());
            }
        }
        System.out.println("get Event By all day event ");
        System.out.println("******");
        return byAllDayEvent;
    }
    public String getDescriptionByEventType(EventType eventType){
        System.out.println("Get description by eventType is started");
        String description = null;
        try {
            for (Event eventRef : event) {
                if (eventType != null && eventRef.getEventType() == eventType) {
                    description = eventRef.getDescription();
                }
            }
            if (description == null)
                new DescriptionNotFoundException("DescriptionNotFound");
            System.out.println("get description by event type ended");
        }catch (DescriptionNotFoundException d){
            d.printStackTrace();
        }
        return description;
    }
    public String getEndDateByStartDate(String startDate){
        System.out.println("Get endDate By startDate started");
        String endDate = null;
        try {
            for (Event eventRef : event) {
                if (startDate != null && eventRef.getStartDate() == startDate) {
                    endDate = eventRef.getEndDate();
                }
            }
            if (endDate == null)
                new EndDateNotFoundException("EndDateNotFound");
            System.out.println("get enddate by startDate ended");
        }catch (EndDateNotFoundException e){
            e.printStackTrace();
        }
        return endDate;
    }

}

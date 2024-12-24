package com.xworkz.calenderapp.event;

import com.xworkz.calenderapp.calender.Calender;
import com.xworkz.calenderapp.calender.GoogleCalender;

import java.util.Scanner;

public class EventRunner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the no of events to be added");
        int size= scanner.nextInt();
       Calender calender = new GoogleCalender(size);

       int i=0;
       for(int a=0; a<size ; a++){
           Event event = new Event();
           System.out.println("Enter event id  ");
           event.setEventId(scanner.nextInt());
           System.out.println("The event conducted by who");
           event.setWho(scanner.next());
           System.out.println("The StartDate ");
           event.setStartDate(scanner.next());
           System.out.println("The endDate ");
           event.setEndDate(scanner.next());
           System.out.println("The description is");
           event.setDescription(scanner.next());
           System.out.println("The all day event is");
           event.setAllDayEvent(scanner.nextBoolean());

       }
    }
}

package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.event.EventType;

public interface Calender {

    public boolean addEvent(Event event);

    public void getDetails();

    public Event getEventById(int eventId);

    public Event getEventByWho(String who);

    public Event getEventByStartDate(String startDate);

    public Event getEventByEndDate(String endDate);

    public Event getEventByDescription(String description);

    public Event getEventByAllDayEvent(boolean isAllDayEvent);

    public String getDescriptionByEventType(EventType eventType);

    public String getEndDateByStartDate(String startDate);

}

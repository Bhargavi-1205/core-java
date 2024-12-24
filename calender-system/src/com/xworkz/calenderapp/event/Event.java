package com.xworkz.calenderapp.event;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Event {
    private int eventId;
    private String who;
    private String startDate;
    private String endDate;
    private String description;
    private boolean allDayEvent;
    private EventType EventType;


}

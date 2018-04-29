package g6.Core;

import java.sql.Date;
import java.sql.Time;

import g6.Resources.Hall;

/**
 * Created by Brandon Keen on 4/28/2018.
 */

public class EventSummary {
    String eventName;
    Date date;
    Time startTime;
    double duration;
    Hall hall;

    public EventSummary() {
    }

    public EventSummary(String eventName, Date date, Time startTime, double duration, Hall hall) {
        this.eventName = eventName;
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
        this.hall = hall;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }


}

package g6.Core;
import java.util.Date;
import java.time.*;

import g6.Resources.*;
/**
 * Created by Brandon Keen on 4/26/2018.
 */

public class Event {
    Date date;
    LocalTime time;
    int duration;
    Resources resources;
    int estimatedAttendies;
    String eventName;
    EventStatus status;

    public Event() {
    }

    public Event(Date date, LocalTime time, int duration, Resources resources, int estimatedAttendies, String eventName, EventStatus status) {
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.resources = resources;
        this.estimatedAttendies = estimatedAttendies;
        this.eventName = eventName;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public int getEstimatedAttendies() {
        return estimatedAttendies;
    }

    public void setEstimatedAttendies(int estimatedAttendies) {
        this.estimatedAttendies = estimatedAttendies;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }




}
package g6.Core;
import java.sql.Date;
import java.sql.Time;

import g6.Resources.*;
/**
 * Created by Brandon Keen on 4/26/2018.
 */

public class Event {

    User user;
    Date date;
    int duration;
    Time startTime;
    Resources resources;
    int estimatedAttendies;
    String eventName;
    EventStatus status;
    String occasion;

    public Event() {
    }

    public Event(String occasion, User user, Date date, int duration,Time startTime, Resources resources, int estimatedAttendies, String eventName, EventStatus status) {
        this.occasion = occasion;
        this.date = date;
        this.duration = duration;
        this.startTime = startTime;
        this.resources = resources;
        this.estimatedAttendies = estimatedAttendies;
        this.eventName = eventName;
        this.status = status;
        this.user = user;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public EventSummary getSummary()
    {
        if(date != null && startTime != null && duration != 0 && resources.getHall() != null)
            return new EventSummary(eventName,date,startTime,duration,resources.getHall());
        else
            return null;
    }

    public UserEventSummary getUserEventSummary()
    {
        UserEventSummary userSummery = (UserEventSummary)getSummary();
        userSummery.setEstimatedCost(generateEstimatedCost());
        return userSummery;
    }

    public CatererEventSummary getCatererEventSummary()
    {
        CatererEventSummary catererSummary = (CatererEventSummary)getSummary();
        catererSummary.setEstAttendence(estimatedAttendies);
        catererSummary.setUser(user);
        return catererSummary;
    }

    public StaffEventSummary getStaffEventSummary()
    {
        StaffEventSummary staffSummary = (StaffEventSummary)getSummary();
        staffSummary.setUser(user);
        return staffSummary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double generateEstimatedCost()
    {
        return resources.calculateCost(duration,estimatedAttendies);
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }
}

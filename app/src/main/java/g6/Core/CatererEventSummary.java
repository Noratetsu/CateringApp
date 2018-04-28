package g6.Core;

import java.sql.Date;
import java.sql.Time;

import g6.Resources.Hall;

/**
 * Created by Brandon Keen on 4/28/2018.
 */

public class CatererEventSummary extends EventSummary {
    private int estAttendence;
    private User user;

    public CatererEventSummary() {
    }

    public CatererEventSummary(String eventName, Date date, Time startTime, double duration, Hall hall) {
        super(eventName, date, startTime, duration, hall);
    }

    public CatererEventSummary(String eventName, Date date, Time startTime, double duration, Hall hall, int estAttendence, User user) {
        super(eventName, date, startTime, duration, hall);
        this.estAttendence = estAttendence;
        this.user = user;
    }

    public int getEstAttendence() {
        return estAttendence;
    }

    public void setEstAttendence(int estAttendence) {
        this.estAttendence = estAttendence;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

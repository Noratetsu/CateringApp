package g6.Core;

import java.sql.Date;
import java.sql.Time;

import g6.Resources.Hall;

/**
 * Created by Brandon Keen on 4/28/2018.
 */

public class StaffEventSummary extends EventSummary {
    private User user;

    public StaffEventSummary() {
    }

    public StaffEventSummary(String eventName, Date date, Time startTime, double duration, Hall hall) {
        super(eventName, date, startTime, duration, hall);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

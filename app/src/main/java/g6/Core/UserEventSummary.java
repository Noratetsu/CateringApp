package g6.Core;

import java.sql.Date;
import java.sql.Time;

import g6.Resources.Hall;

/**
 * Created by Brandon Keen on 4/28/2018.
 */

public class UserEventSummary extends EventSummary {

    private double estimatedCost;

    public UserEventSummary(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public UserEventSummary(String eventName, Date date, Time startTime, double duration, Hall hall,int estimatedCost) {
        super(eventName, date, startTime, duration, hall);
        this.estimatedCost = estimatedCost;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
}
